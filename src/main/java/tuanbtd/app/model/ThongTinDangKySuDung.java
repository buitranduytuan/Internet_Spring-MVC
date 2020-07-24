/**
 *@author TuanBTD
 *@date Dec 27, 2019
 *@version version
 */

package tuanbtd.app.model;

public class ThongTinDangKySuDung {
//	Mã KH, Tên KH, Mã máy, Vị trí, Trạng thái, Ngày bắt đầu sử dụng máy, Gi�? bắt đầu sử dụng máy, Th�?i gian sử dụng máy,
//	Mã dịch vụ, Ngày sử dụng dịch vụ, Gi�? sử dụng dịch vụ, Số lượng, Tổng ti�?n.
    private String maKH;
    private String tenKH;
    private String maMay;
    private String viTri;
    private String trangThai;
    private String ngayBDSDMay;
    private String gioBDSDMay;
    private String thoiGianSDMay;
    private String maDV;
    private String ngaySD;
    private String gioSD;
    private String soLuong;
    private String tongTien;

    public ThongTinDangKySuDung() {
        super();
    }

    
    public ThongTinDangKySuDung(String maKH, String tenKH, String maMay, String viTri, String trangThai,
            String ngayBDSDMay, String gioBDSDMay, String thoiGianSDMay, String maDV, String ngaySD, String gioSD,
            String soLuong, String tongTien) {
        super();
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.maMay = maMay;
        this.viTri = viTri;
        this.trangThai = trangThai;
        this.ngayBDSDMay = ngayBDSDMay;
        this.gioBDSDMay = gioBDSDMay;
        this.thoiGianSDMay = thoiGianSDMay;
        this.maDV = maDV;
        this.ngaySD = ngaySD;
        this.gioSD = gioSD;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
    }

    public ThongTinDangKySuDung(Object maKH, Object tenKH, Object maMay, Object viTri, Object trangThai,
            Object ngayBDSDMay, Object gioBDSDMay, Object thoiGianSDMay, Object maDV, Object ngaySD, Object gioSD,
            Object soLuong, Object tongTien) {
        super();
        this.maKH = (String) maKH;
        this.tenKH = (String) tenKH;
        this.maMay = (String) maMay;
        this.viTri = (String) viTri;
        this.trangThai = (String) trangThai;
        this.ngayBDSDMay = ngayBDSDMay.toString();
        this.gioBDSDMay = (String) gioBDSDMay;
        this.thoiGianSDMay = thoiGianSDMay.toString();
        this.maDV = (String) maDV;
        this.ngaySD = ngaySD.toString();
        this.gioSD = (String) gioSD;
        this.soLuong = soLuong.toString();
        this.tongTien = tongTien.toString();
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

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getNgayBDSDMay() {
        return ngayBDSDMay;
    }

    public void setNgayBDSDMay(String ngayBDSDMay) {
        this.ngayBDSDMay = ngayBDSDMay;
    }

    public String getGioBDSDMay() {
        return gioBDSDMay;
    }

    public void setGioBDSDMay(String gioBDSDMay) {
        this.gioBDSDMay = gioBDSDMay;
    }

    public String getThoiGianSDMay() {
        return thoiGianSDMay;
    }

    public void setThoiGianSDMay(String thoiGianSDMay) {
        this.thoiGianSDMay = thoiGianSDMay;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }



    @Override
    public String toString() {
        return "ThongTinDangKySuDung [maKH=" + maKH + ", tenKH=" + tenKH + ", maMay=" + maMay + ", viTri=" + viTri
                + ", trangThai=" + trangThai + ", ngayBDSDMay=" + ngayBDSDMay + ", gioBDSDMay=" + gioBDSDMay
                + ", thoiGianSDMay=" + thoiGianSDMay + ", maDV=" + maDV + ", ngaySD=" + ngaySD + ", gioSD=" + gioSD
                + ", soLuong=" + soLuong + ", tongTien=" + tongTien + "]";
    }


    public String getNgaySD() {
        return ngaySD;
    }

    public void setNgaySD(String ngaySD) {
        this.ngaySD = ngaySD;
    }

    public String getGioSD() {
        return gioSD;
    }

    public void setGioSD(String gioSD) {
        this.gioSD = gioSD;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

}
