package com.example.demo.qdhRepository;

import com.example.demo.qdhEntity.QDHSanCon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QDHSanConRepository extends JpaRepository<QDHSanCon, Long> {

    List<QDHSanCon> findByCumSanId(Long cumSanId);

}