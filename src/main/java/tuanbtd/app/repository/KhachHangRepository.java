package tuanbtd.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tuanbtd.app.entity.KhachHang;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, String> {
    KhachHang findByMaKH(String maKH);

    @Query("SELECT kh.maKH FROM KhachHang kh")
    public List<String> getAllMaKhachHang();

    public List<KhachHang> findByMaKHContainingIgnoreCase(String maKH);

    public List<KhachHang> findByMaKHStartsWith(String maKH); // 'xxx%'

    public List<KhachHang> findByMaKHEndsWith(String maKH); // '%xxx'

//	SELECT * FROM KhachHang WHERE maKH LIKE '%x%';
//	@Query("Select kh from KhachHang kh WHERE kh.maKH LIKE %:xxx%")
//  List<Registration> findByPlaceContaining(@Param("xxx")String xxx);
    public List<KhachHang> findByMaKHContaining(String maKH);

    // List<Movie> findByTitleLike(String title);
    // results = movieRepository.findByTitleLike("%in%");

    public List<KhachHang> findByMaKHContainingOrTenKHContainingOrDiaChiContainingOrSdtContainingOrEmailContaining(
            String maKH, String tenKH, String diaChi, String sdt, String email);
    
    
    
      @Query(value = "SELECT KH.maKH, tenKH, May.maMay, viTri, trangThai, ngayBDSD, gioBDSD, thoiGianSD, DichVu.maDV, ngaySD, gioSD, soLuong, "
      + "(SELECT SUM(soLuong*donGia) FROM KhachHang KH1 INNER JOIN SuDungDichVu SDDV ON KH1.maKH = SDDV.maKH "
      + "INNER JOIN DichVu ON SDDV.maDV = DichVu.maDV WHERE KH1.maKH = KH.maKH GROUP BY KH1.maKH) AS TongTien "
      + "FROM (KhachHang KH "
      + "LEFT JOIN (SuDungMay INNER JOIN May ON SuDungMay.maMay = may.maMay) ON KH.maKH = SuDungMay.maKH) "
      + "LEFT JOIN (SuDungDichVu SDDV INNER JOIN DichVu ON SDDV.maDV = DichVu.maDV) ON KH.maKH = SDDV.maKH "
      + "WHERE thoiGianSD IS NOT NULL OR soLuong IS NOT NULL", nativeQuery = true)
      public
      List<Object[]> getAllThongTin();
      
      
}
