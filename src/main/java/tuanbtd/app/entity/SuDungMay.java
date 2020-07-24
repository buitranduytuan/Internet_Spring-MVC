package tuanbtd.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@IdClass(SuDungMayId.class)
public class SuDungMay implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "maKH")
    private KhachHang maKH;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "maMay")
    private May maMay;

    @Id
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date ngayBDSD;

    @Id
    private String gioBDSD;

    private int thoiGianSD;

    public SuDungMay() {
        super();
    }

    public SuDungMay(KhachHang maKH, May maMay, Date ngayBDSD, String gioBDSD, int thoiGianSD) {
        super();
        this.maKH = maKH;
        this.maMay = maMay;
        this.ngayBDSD = ngayBDSD;
        this.gioBDSD = gioBDSD;
        this.thoiGianSD = thoiGianSD;
    }

    public KhachHang getMaKH() {
        return maKH;
    }

    public void setMaKH(KhachHang maKH) {
        this.maKH = maKH;
    }

    public May getMaMay() {
        return maMay;
    }

    public void setMaMay(May maMay) {
        this.maMay = maMay;
    }

    public Date getNgayBDSD() {
        return ngayBDSD;
    }

    public void setNgayBDSD(Date ngayBDSD) {
        this.ngayBDSD = ngayBDSD;
    }

    public String getGioBDSD() {
        return gioBDSD;
    }

    public void setGioBDSD(String gioBDSD) {
        this.gioBDSD = gioBDSD;
    }

    public int getThoiGianSD() {
        return thoiGianSD;
    }

    public void setThoiGianSD(int thoiGianSD) {
        this.thoiGianSD = thoiGianSD;
    }

}
