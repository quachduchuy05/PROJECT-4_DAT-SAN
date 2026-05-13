package com.example.demo.qdhEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "nguoi_dung")
public class QDHNguoiDung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
    private String hoTen;

    private String email;

    private String mat_khau;

    private String soDienThoai;

    private String vaiTro;
=======
    private String ho_ten;

    private String email;

    private String so_dien_thoai;

    private String mat_khau;

    private String anh_dai_dien;

    private String vai_tro;

    private String trang_thai;
>>>>>>> a7dbee490621208c705553c8ab89ae44abf03cc7

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

<<<<<<< HEAD
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
=======
    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
>>>>>>> a7dbee490621208c705553c8ab89ae44abf03cc7
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

<<<<<<< HEAD
=======
    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }

>>>>>>> a7dbee490621208c705553c8ab89ae44abf03cc7
    public String getMat_khau() {
        return mat_khau;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }

<<<<<<< HEAD
    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
=======
    public String getAnh_dai_dien() {
        return anh_dai_dien;
    }

    public void setAnh_dai_dien(String anh_dai_dien) {
        this.anh_dai_dien = anh_dai_dien;
    }

    public String getVai_tro() {
        return vai_tro;
    }

    public void setVai_tro(String vai_tro) {
        this.vai_tro = vai_tro;
    }

    public String getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(String trang_thai) {
        this.trang_thai = trang_thai;
>>>>>>> a7dbee490621208c705553c8ab89ae44abf03cc7
    }
}