/**
 *@author TuanBTD
 *@date Dec 27, 2019
 *@version version
 */

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
@IdClass(SuDungDichVuId.class)
public class SuDungDichVu implements Serializable {
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
    @JoinColumn(name = "maDV")
    private DichVu maDV;

    @Id
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date ngaySD;

    @Id
    private String gioSD;

    private int soLuong;

    public SuDungDichVu(KhachHang maKH, DichVu maDV, Date ngaySD, String gioSD, int soLuong) {
        super();
        this.maKH = maKH;
        this.maDV = maDV;
        this.ngaySD = ngaySD;
        this.gioSD = gioSD;
        this.soLuong = soLuong;
    }

    public SuDungDichVu() {
        super();
    }

    public KhachHang getMaKH() {
        return maKH;
    }

    public void setMaKH(KhachHang maKH) {
        this.maKH = maKH;
    }

    public DichVu getMaDV() {
        return maDV;
    }

    public void setMaDV(DichVu maDV) {
        this.maDV = maDV;
    }

    public Date getNgaySD() {
        return ngaySD;
    }

    public void setNgaySD(Date ngaySD) {
        this.ngaySD = ngaySD;
    }

    public String getGioSD() {
        return gioSD;
    }

    public void setGioSD(String gioSD) {
        this.gioSD = gioSD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

}
