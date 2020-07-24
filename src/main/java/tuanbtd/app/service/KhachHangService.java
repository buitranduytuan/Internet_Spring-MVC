package tuanbtd.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tuanbtd.app.entity.KhachHang;
import tuanbtd.app.model.ThongTinDangKySuDung;

@Service
public interface KhachHangService {

    public List<KhachHang> getAllKhachHang();

    public void createKhachHang(KhachHang khachHang);

    public KhachHang getKHByMaKH(String maKH);

    public List<String> getAllMaKH();

    public void editKhachHang(KhachHang khachHang);

    public void deleteKhachHang(String maKH);

    public List<KhachHang> searchKhachHangByMaKH(String content);

    public List<KhachHang> searchKhachHangFullAttribute(String content);
    
    public List<ThongTinDangKySuDung> getAllThongTinSD(); 
}
