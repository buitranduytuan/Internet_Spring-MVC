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
public class May implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    private String maMay;

    @Column(columnDefinition = "nvarchar(255)")
    private String viTri;

    @Column(columnDefinition = "nvarchar(255)")
    private String trangThai;

    @OneToMany(mappedBy = "maMay", cascade = CascadeType.ALL)
    List<SuDungMay> sdMay;

    public May() {
        super();
    }

    public May(String maMay) {
        super();
        this.maMay = maMay;
    }

    public May(String maMay, String viTri, String trangThai) {
        super();
        this.maMay = maMay;
        this.viTri = viTri;
        this.trangThai = trangThai;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public List<SuDungMay> getSdMay() {
        return sdMay;
    }

    public void setSdMay(List<SuDungMay> sdMay) {
        this.sdMay = sdMay;
    }

}
