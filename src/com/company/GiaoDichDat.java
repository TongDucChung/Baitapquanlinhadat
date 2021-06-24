package com.company;

public class GiaoDichDat extends Giaodich{
    private String loaiDat;

    public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, String donGia, String dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public String toString() {
        return "GiaoDichDat{" +
                "loaiDat='" + loaiDat + '\'' +
                '}';
    }
}
