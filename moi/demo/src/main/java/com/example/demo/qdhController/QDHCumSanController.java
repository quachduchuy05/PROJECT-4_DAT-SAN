package com.example.demo.qdhController;

import com.example.demo.qdhEntity.QDHCumSan;
import com.example.demo.qdhRepository.QDHCumSanRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cum-san")
public class QDHCumSanController {

    private final QDHCumSanRepository repository;

    public QDHCumSanController(QDHCumSanRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<QDHCumSan> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public QDHCumSan getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
}