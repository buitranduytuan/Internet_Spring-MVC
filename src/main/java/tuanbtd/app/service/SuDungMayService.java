package tuanbtd.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tuanbtd.app.entity.SuDungMay;

@Service
public interface SuDungMayService {

    public List<SuDungMay> getAllDangKyMay();

    public void dangKySuDungMay(SuDungMay sdMay);
}
