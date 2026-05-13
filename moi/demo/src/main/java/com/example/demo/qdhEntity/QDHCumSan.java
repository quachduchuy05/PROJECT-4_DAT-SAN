package com.example.demo.qdhEntity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cum_san")
@Getter
@Setter
public class QDHCumSan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chu_san_id")
    private Long chuSanId;

    @Column(name = "loai_the_thao_id")
    private Long loaiTheThaoId;

    @Column(name = "ten_cum_san")
    private String tenCumSan;

    @Column(name = "duong_dan")
    private String duongDan;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "phuong_xa")
    private String phuongXa;

    @Column(name = "quan_huyen")
    private String quanHuyen;

    @Column(name = "thanh_pho")
    private String thanhPho;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @Column(name = "gio_mo_cua")
    private String gioMoCua;

    @Column(name = "gio_dong_cua")
    private String gioDongCua;

    @Column(name = "diem_danh_gia")
    private Double diemDanhGia;

    @Column(name = "tong_danh_gia")
    private Integer tongDanhGia;

    @Column(name = "trang_thai")
    private String trangThai;
}