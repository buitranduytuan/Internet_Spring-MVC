package tuanbtd.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuanbtd.app.entity.SuDungMay;
import tuanbtd.app.repository.SuDungMayRepository;
import tuanbtd.app.service.SuDungMayService;

@Service
public class SuDungMayServiceImpl implements SuDungMayService {

    @Autowired
    private SuDungMayRepository suDungMayRepository;

    @Override
    public List<SuDungMay> getAllDangKyMay() {
        return suDungMayRepository.findAll();
    }

    @Override
    public void dangKySuDungMay(SuDungMay sdMay) {
        suDungMayRepository.save(sdMay);
    }

}
