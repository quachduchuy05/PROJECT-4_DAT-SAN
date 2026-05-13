package com.example.demo.qdhRepository;

import com.example.demo.qdhEntity.QDHNguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
@Repository
=======
>>>>>>> a7dbee490621208c705553c8ab89ae44abf03cc7
public interface QDHNguoiDungRepository extends JpaRepository<QDHNguoiDung, Long> {

    QDHNguoiDung findByEmail(String email);

}