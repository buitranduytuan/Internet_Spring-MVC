package tuanbtd.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tuanbtd.app.entity.May;

@Repository
public interface MayRepository extends JpaRepository<May, String> {
    May findByMaMay(String maMay);

    @Query("SELECT m.maMay FROM May m")
    List<String> getAllMaMay();

    public List<May> findByMaMayContainingOrTrangThaiContainingOrViTriContaining(String maMay, String trangThai,
            String viTri);

    @Query("SELECT m.maMay FROM May m WHERE m.trangThai =:trangThai")
    public List<String> getTrangThaiMay(@Param("trangThai") String trangThai);

}
