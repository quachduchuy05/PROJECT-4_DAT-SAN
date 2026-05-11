package com.example.demo.qdhEntity;

public class QDHSanBong {

    private int id;
    private String tenSan;
    private String loaiSan;
    private int gia;

    public QDHSanBong(int id, String tenSan, String loaiSan, int gia) {
        this.id = id;
        this.tenSan = tenSan;
        this.loaiSan = loaiSan;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public String getTenSan() {
        return tenSan;
    }

    public String getLoaiSan() {
        return loaiSan;
    }

    public int getGia() {
        return gia;
    }
}