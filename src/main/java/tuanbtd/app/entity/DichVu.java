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
public class DichVu implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    private String maDV;

    @Column(columnDefinition = "nvarchar(255)")
    private String tenDV;
    private String donViTinh;
    private int donGia;

    @OneToMany(mappedBy = "maDV", cascade = CascadeType.ALL)
    List<SuDungDichVu> sdDV;

    public DichVu() {
        super();
    }

    public DichVu(String maDV) {
        this.maDV = maDV;
    }

    public DichVu(String maDV, String tenDV, String donViTinh, int donGia) {
        super();
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.donViTinh = donViTinh;
        this.donGia = donGia;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public List<SuDungDichVu> getSdDV() {
        return sdDV;
    }

    public void setSdDV(List<SuDungDichVu> sdDV) {
        this.sdDV = sdDV;
    }

}
