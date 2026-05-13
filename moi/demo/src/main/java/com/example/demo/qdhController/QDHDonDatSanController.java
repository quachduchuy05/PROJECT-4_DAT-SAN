package com.example.demo.qdhController;

import com.example.demo.qdhEntity.QDHDonDatSan;
import com.example.demo.qdhRepository.QDHDonDatSanRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dat-san")
public class QDHDonDatSanController {

    private final QDHDonDatSanRepository repository;

    public QDHDonDatSanController(QDHDonDatSanRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<QDHDonDatSan> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public String datSan(@RequestBody QDHDonDatSan donDatSan) {

        boolean daTonTai = repository.existsBySanConIdAndNgayDatAndKhungGioId(
                donDatSan.getSanConId(),
                donDatSan.getNgayDat(),
                donDatSan.getKhungGioId()
        );

        if (daTonTai) {
            return "Khung giờ này đã được đặt!";
        }

        repository.save(donDatSan);

        return "Đặt sân thành công!";
    }

    @GetMapping("/san/{sanConId}")
    public List<QDHDonDatSan> getBySan(@PathVariable Long sanConId) {
        return repository.findBySanConId(sanConId);
    }
    @DeleteMapping("/{id}")
    public String huyDon(@PathVariable Long id) {

        if (!repository.existsById(id)) {
            return "Không tìm thấy đơn đặt sân!";
        }

        repository.deleteById(id);

        return "Hủy đơn đặt sân thành công!";
    }
    @PutMapping("/{id}/trang-thai")
    public String capNhatTrangThai(
            @PathVariable Long id,
            @RequestBody QDHDonDatSan data
    ) {
        QDHDonDatSan don = repository.findById(id).orElse(null);

        if (don == null) {
            return "Không tìm thấy đơn đặt sân!";
        }

        don.setTrangThai(data.getTrangThai());
        repository.save(don);

        return "Cập nhật trạng thái thành công!";
    }
}