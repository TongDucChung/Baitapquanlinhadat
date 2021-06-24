package com.company;

public class GiaoDichNha extends Giaodich{
    private String diaChi;
    private String loaiNha;

    public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, String donGia, String dienTich, String diaChi, String loaiNha) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.diaChi = diaChi;
        this.loaiNha = loaiNha;
    }

    public GiaoDichNha(String diaChi, String loaiNha) {
        this.diaChi = diaChi;
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    @Override
    public String toString() {
        return "GiaoDichNha{}";
    }
}
