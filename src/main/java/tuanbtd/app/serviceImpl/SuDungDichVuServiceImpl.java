package tuanbtd.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuanbtd.app.entity.SuDungDichVu;
import tuanbtd.app.model.SuDungDichVuInfoModel;
import tuanbtd.app.repository.SuDungDichVuRepository;
import tuanbtd.app.service.SuDungDichVuService;

@Service
public class SuDungDichVuServiceImpl implements SuDungDichVuService {

    @Autowired
    private SuDungDichVuRepository suDungDichVuRepository;

    @Override
    public List<SuDungDichVu> getAllDangKyDV() {
        List<SuDungDichVu> listSDDV = suDungDichVuRepository.findAll();
        return listSDDV;
    }

    @Override
    public void dangKySuDungDichVu(SuDungDichVu sddv) {
        suDungDichVuRepository.save(sddv);
    }

    @Override
    public List<SuDungDichVuInfoModel> getListSDDV() {
        return suDungDichVuRepository.getAllSuDungDV();
    }

}
