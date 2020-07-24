package tuanbtd.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tuanbtd.app.entity.DichVu;

@Repository
public interface DichVuRepository extends JpaRepository<DichVu, String> {
    DichVu findByMaDV(String maDV);

    @Query("SELECT dv.maDV FROM DichVu dv")
    List<String> getAllMaDV();

    public List<DichVu> findByMaDVContainingOrTenDVContainingOrDonViTinhContainingOrDonGiaContaining(String maDV,
            String tenDV, String donViTinh, String donGia);
}
