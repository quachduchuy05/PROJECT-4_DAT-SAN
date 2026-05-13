package com.example.demo.qdhEntity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "san_con")
@Getter
@Setter
public class QDHSanCon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cum_san_id")
    private Long cumSanId;

    @Column(name = "ten_san")
    private String tenSan;

    @Column(name = "ma_san")
    private String maSan;

    @Column(name = "suc_chua")
    private Integer sucChua;

    @Column(name = "loai_mat_san")
    private String loaiMatSan;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "trang_thai")
    private String trangThai;
}