package com.example.demo.qdhEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "nguoi_dung")
public class QDHNguoiDung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String hoTen;

    private String vaiTro;
}
