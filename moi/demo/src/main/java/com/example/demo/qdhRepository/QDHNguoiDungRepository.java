package com.example.demo.qdhRepository;

import com.example.demo.qdhEntity.QDHNguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QDHNguoiDungRepository extends JpaRepository<QDHNguoiDung, Long> {

    QDHNguoiDung findByEmail(String email);

}