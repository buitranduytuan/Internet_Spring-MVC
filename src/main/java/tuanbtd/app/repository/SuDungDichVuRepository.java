package tuanbtd.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tuanbtd.app.entity.SuDungDichVu;
import tuanbtd.app.entity.SuDungDichVuId;
import tuanbtd.app.model.SuDungDichVuInfoModel;

@Repository
public interface SuDungDichVuRepository extends JpaRepository<SuDungDichVu, SuDungDichVuId> {

    
    @Query(value = "Select new vn.com.fsoft.app.model.SuDungDichVuInfoModel( kh.maKH, kh.tenKH, kh.diaChi, kh.email, dv.maDV, ngaySD, gioSD ,soLuong, donGia, soLuong*donGia " + 
            "from KhachHang kh  " + 
            "inner join SuDungDichVu sddv on kh.maKH = sddv.maKH " + 
            "inner join DichVu dv on dv.maDV = sddv.maDV", nativeQuery = true)
    public List<SuDungDichVuInfoModel> getAllSuDungDV();
}
