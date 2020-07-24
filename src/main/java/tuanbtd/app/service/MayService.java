package tuanbtd.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tuanbtd.app.entity.May;

@Service
public interface MayService {

    public List<May> getAllMay();

    public void createMay(May may);

    public May getMayByMaMay(String maMay);

    public void editMay(May may);

    public void deleteMay(String maMay);

    public List<String> getAllMaMay();

    public List<May> searchMayByFullAttribute(String content);

    public boolean isExist(String maMay);

    public List<String> getAllMaMayDangRanh();
    
}
