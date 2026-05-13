package com.example.demo.qdhController;

import com.example.demo.qdhEntity.QDHSanCon;
import com.example.demo.qdhRepository.QDHSanConRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/san-con")
public class QDHSanConController {

    private final QDHSanConRepository repository;

    public QDHSanConController(QDHSanConRepository repository) {
        this.repository = repository;
    }

    // Lấy tất cả sân con
    @GetMapping
    public List<QDHSanCon> getAll() {
        return repository.findAll();
    }

    // Lấy chi tiết sân con theo id
    @GetMapping("/{id}")
    public QDHSanCon getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // Lấy sân con theo cụm sân
    @GetMapping("/cum-san/{cumSanId}")
    public List<QDHSanCon> getByCumSan(@PathVariable Long cumSanId) {
        return repository.findByCumSanId(cumSanId);
    }
}