package com.example.demo.qdhController;

import com.example.demo.qdhEntity.QDHNguoiDung;
import com.example.demo.qdhRepository.QDHNguoiDungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nguoi-dung")
public class QDHNguoiDungController {

    @Autowired
    private QDHNguoiDungRepository repository;

    @PostMapping("/dang-ky")
    public String dangKy(@RequestBody QDHNguoiDung nguoiDung) {

        QDHNguoiDung check = repository.findByEmail(nguoiDung.getEmail());

        if (check != null) {
            return "Email đã tồn tại!";
        }

        repository.save(nguoiDung);

        return "Đăng ký thành công!";
    }

    @PostMapping("/dang-nhap")
    public String dangNhap(@RequestBody QDHNguoiDung nguoiDung) {

        QDHNguoiDung check =
                repository.findByEmail(nguoiDung.getEmail());

        if (check == null) {
            return "Email không tồn tại!";
        }

        if (!check.getMat_khau().equals(nguoiDung.getMat_khau())) {
            return "Sai mật khẩu!";
        }

        return "Đăng nhập thành công!";
    }
}