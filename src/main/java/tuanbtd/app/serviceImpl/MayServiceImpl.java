package tuanbtd.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuanbtd.app.entity.May;
import tuanbtd.app.repository.MayRepository;
import tuanbtd.app.service.MayService;

@Service
public class MayServiceImpl implements MayService {

    @Autowired
    private MayRepository mayRepository;

    public List<May> getAllMay() {
        return mayRepository.findAll();
    }

    @Override
    public void createMay(May may) {
        if (mayRepository.exists(may.getMaMay()) == false) {
            mayRepository.save(may);
        }
    }

    @Override
    public May getMayByMaMay(String maMay) {
        May may = mayRepository.findByMaMay(maMay);
        return may;
    }

    @Override
    public void deleteMay(String maMay) {
        mayRepository.delete(maMay);
    }

    @Override
    public void editMay(May may) {
        mayRepository.save(may);
    }

    @Override
    public List<String> getAllMaMay() {
        return mayRepository.getAllMaMay();
    }

    @Override
    public List<May> searchMayByFullAttribute(String x) {
        return mayRepository.findByMaMayContainingOrTrangThaiContainingOrViTriContaining(x, x, x);
    }

    @Override
    public boolean isExist(String maMay) {
        return mayRepository.exists(maMay);
    }

    @Override
    public List<String> getAllMaMayDangRanh() {
        return mayRepository.getTrangThaiMay("Ä?ang ráº£nh");
    }

}
