package com.example.demo.qdhEntity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "loai_the_thao")
@Getter
@Setter
public class QDHLoaiTheThao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten_loai")
    private String tenLoai;

    @Column(name = "duong_dan")
    private String duongDan;

    @Column(name = "bieu_tuong")
    private String bieuTuong;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "trang_thai")
    private String trangThai;
}