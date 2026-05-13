package com.example.demo.qdhController;

import com.example.demo.qdhEntity.QDHLoaiTheThao;
import com.example.demo.qdhRepository.QDHLoaiTheThaoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loai-the-thao")
public class QDHLoaiTheThaoController {

    private final QDHLoaiTheThaoRepository repository;

    public QDHLoaiTheThaoController(QDHLoaiTheThaoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<QDHLoaiTheThao> getAll() {
        return repository.findAll();
    }
}