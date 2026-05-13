package com.example.demo.qdhEntity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "don_dat_san")
@Getter
@Setter
public class QDHDonDatSan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ma_don")
    private String maDon;

    @Column(name = "nguoi_dung_id")
    private Long nguoiDungId;

    @Column(name = "san_con_id")
    private Long sanConId;

    @Column(name = "ngay_dat")
    private LocalDate ngayDat;

    @Column(name = "khung_gio_id")
    private Long khungGioId;

    @Column(name = "tong_tien")
    private BigDecimal tongTien;

    @Column(name = "ghi_chu")
    private String ghiChu;

    @Column(name = "trang_thai")
    private String trangThai;
}