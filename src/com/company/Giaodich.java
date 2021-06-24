package com.company;

public class Giaodich {
    private String maGiaoDich;
    private String ngayGiaoDich;
    private String donGia;
    private String dienTich;

    public Giaodich(String maGiaoDich, String ngayGiaoDich, String donGia, String dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
    public Giaodich(){
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public String getDienTich() {
        return dienTich;
    }

    public void setDienTich(String dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "Giaodich{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                ", donGia='" + donGia + '\'' +
                ", dienTich='" + dienTich + '\'' +
                '}';
    }
}
