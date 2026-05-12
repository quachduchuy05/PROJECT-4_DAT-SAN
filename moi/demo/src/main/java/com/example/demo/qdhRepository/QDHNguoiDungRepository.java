package com.example.demo.qdhRepository;

import com.example.demo.qdhEntity.QDHNguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QDHNguoiDungRepository
        extends JpaRepository<QDHNguoiDung, Long> {

    QDHNguoiDung findByUsername(String username);

}
