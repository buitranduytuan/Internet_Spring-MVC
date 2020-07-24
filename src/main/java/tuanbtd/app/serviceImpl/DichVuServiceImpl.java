package tuanbtd.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuanbtd.app.entity.DichVu;
import tuanbtd.app.repository.DichVuRepository;
import tuanbtd.app.service.DichVuService;

@Service
public class DichVuServiceImpl implements DichVuService {

    @Autowired
    private DichVuRepository dichVuRepository;

    @Override
    public List<DichVu> getAllDichVu() {
        List<DichVu> listDV = dichVuRepository.findAll();
        return listDV;
    }

    @Override
    public void createDichVu(DichVu dichVu) {
        if (dichVuRepository.exists(dichVu.getMaDV()) == false) {
            dichVuRepository.save(dichVu);
        }
    }

    @Override
    public DichVu getDVByMaDV(String maDV) {
        DichVu dichVu = dichVuRepository.findByMaDV(maDV);
        return dichVu;
    }

    @Override
    public void editDichVu(DichVu dichVu) {
        dichVuRepository.save(dichVu);
    }

    @Override
    public void deleteDichVu(String maDV) {
        dichVuRepository.delete(maDV);
    }

    @Override
    public List<String> getAllMaDV() {
        return dichVuRepository.getAllMaDV();
    }

    @Override
    public List<DichVu> searchDVByFullAttribute(String x) {
        return dichVuRepository.findByMaDVContainingOrTenDVContainingOrDonViTinhContainingOrDonGiaContaining(x, x, x,
                x);
    }

}
