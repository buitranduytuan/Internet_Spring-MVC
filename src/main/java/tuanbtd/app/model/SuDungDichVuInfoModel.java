package tuanbtd.app.model;

import java.util.Date;

public class SuDungDichVuInfoModel {
    private String maKH;
    private String tenKH;
    private String diaChi;
    private String email;
    private String maDV;
    private Date ngaySD;
    private String gioSD;
    private int soLuong;
    private int donGia;
    private int thanhTien;
    public SuDungDichVuInfoModel(String maKH, String tenKH, String diaChi, String email, String maDV, Date ngaySD,
            String gioSD, int soLuong, int donGia, int thanhTien) {
        super();
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.email = email;
        this.maDV = maDV;
        this.ngaySD = ngaySD;
        this.gioSD = gioSD;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }
    
    public SuDungDichVuInfoModel() {
        super();
    }
    public String getMaKH() {
        return maKH;
    }
    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
    public String getTenKH() {
        return tenKH;
    }
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMaDV() {
        return maDV;
    }
    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }
    public Date getNgaySD() {
        return ngaySD;
    }
    public void setNgaySD(Date ngaySD) {
        this.ngaySD = ngaySD;
    }
    public String getGioSD() {
        return gioSD;
    }
    public void setGioSD(String gioSD) {
        this.gioSD = gioSD;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public int getDonGia() {
        return donGia;
    }
    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    public int getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

}
