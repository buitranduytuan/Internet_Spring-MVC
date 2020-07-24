package tuanbtd.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tuanbtd.app.entity.SuDungDichVu;
import tuanbtd.app.model.SuDungDichVuInfoModel;

@Service
public interface SuDungDichVuService {

    public List<SuDungDichVu> getAllDangKyDV();

    public void dangKySuDungDichVu(SuDungDichVu sddv);

    public List<SuDungDichVuInfoModel> getListSDDV();
    
}
