package tuanbtd.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tuanbtd.app.entity.DichVu;

@Service
public interface DichVuService {

    public List<DichVu> getAllDichVu();

    public void createDichVu(DichVu dichVu);

    public DichVu getDVByMaDV(String maDV);

    public List<String> getAllMaDV();

    public void editDichVu(DichVu dichVu);

    public void deleteDichVu(String maDV);

    public List<DichVu> searchDVByFullAttribute(String content);
}
