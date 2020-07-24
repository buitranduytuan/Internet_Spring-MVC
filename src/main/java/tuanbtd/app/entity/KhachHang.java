/**
 *@author TuanBTD
 *@date Dec 27, 2019
 *@version version
 */

package tuanbtd.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class KhachHang implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "MaKH")
    private String maKH;

    @Column(columnDefinition = "nvarchar(255)")
    private String tenKH;

    @Column(columnDefinition = "nvarchar(255)")
    private String diaChi;
    private String sdt;
    private String email;

    @OneToMany(mappedBy = "maKH", cascade = CascadeType.ALL)
    List<SuDungMay> sdMay;

    @OneToMany(mappedBy = "maKH", cascade = CascadeType.ALL)
    List<SuDungDichVu> sdDV;

    public KhachHang() {
        super();
    }

    public KhachHang(String maKH) {
        this.maKH = maKH;
    }

    public KhachHang(String maKH, String tenKH, String diaChi, String sdt, String email) {
        super();
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<SuDungMay> getSdMay() {
        return sdMay;
    }

    public void setSdMay(List<SuDungMay> sdMay) {
        this.sdMay = sdMay;
    }

    public List<SuDungDichVu> getSdDV() {
        return sdDV;
    }

    public void setSdDV(List<SuDungDichVu> sdDV) {
        this.sdDV = sdDV;
    }

}
