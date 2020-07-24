package tuanbtd.app.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuanbtd.app.entity.KhachHang;
import tuanbtd.app.model.ThongTinDangKySuDung;
import tuanbtd.app.repository.KhachHangRepository;
import tuanbtd.app.service.KhachHangService;

@Service
public class KhachHangServiecImpl implements KhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepository;

    @Override
    public List<KhachHang> getAllKhachHang() {
        List<KhachHang> listKH = khachHangRepository.findAll();
        return listKH;
    }

    @Override
    public void createKhachHang(KhachHang khachHang) {
        if (khachHangRepository.exists(khachHang.getMaKH()) == false) {
            khachHangRepository.save(khachHang);
        }
    }

    @Override
    public KhachHang getKHByMaKH(String maKH) {
        KhachHang khachHang = khachHangRepository.findByMaKH(maKH);
        return khachHang;
    }

    @Override
    public void editKhachHang(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public void deleteKhachHang(String maKH) {
        khachHangRepository.delete(maKH);
    }

    @Override
    public List<String> getAllMaKH() {
        return khachHangRepository.getAllMaKhachHang();
    }

    @Override
    public List<KhachHang> searchKhachHangByMaKH(String content) {
        return khachHangRepository.findByMaKHContaining(content);
    }

    @Override
    public List<KhachHang> searchKhachHangFullAttribute(String x) {
        return khachHangRepository
                .findByMaKHContainingOrTenKHContainingOrDiaChiContainingOrSdtContainingOrEmailContaining(x, x, x, x, x);
    }


    @Override public List<ThongTinDangKySuDung> getAllThongTinSD(){
        List<Object[]> listResult = khachHangRepository.getAllThongTin();
        List<ThongTinDangKySuDung> listThongTin = new ArrayList<ThongTinDangKySuDung>();
        for(Object[] result : listResult) {
            ThongTinDangKySuDung thongTin = new ThongTinDangKySuDung(result[0], result[1], result[2], result[3], result[4], result[5],
                    result[6], result[7], result[8], result[9], result[10], result[11], result[12]);
            listThongTin.add(thongTin);
        }
        
        return listThongTin;
    }


}
