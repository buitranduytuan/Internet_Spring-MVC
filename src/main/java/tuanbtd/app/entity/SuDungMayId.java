package tuanbtd.app.entity;

import java.io.Serializable;
import java.util.Date;

public class SuDungMayId implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private KhachHang maKH;
    private May maMay;
    private Date ngayBDSD;
    private String gioBDSD;

    public SuDungMayId() {
        super();
    }

    public SuDungMayId(KhachHang maKH, May maMay, Date ngayBDSD, String gioBDSD) {
        super();
        this.maKH = maKH;
        this.maMay = maMay;
        this.ngayBDSD = ngayBDSD;
        this.gioBDSD = gioBDSD;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((gioBDSD == null) ? 0 : gioBDSD.hashCode());
        result = prime * result + ((maKH == null) ? 0 : maKH.hashCode());
        result = prime * result + ((maMay == null) ? 0 : maMay.hashCode());
        result = prime * result + ((ngayBDSD == null) ? 0 : ngayBDSD.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SuDungMayId other = (SuDungMayId) obj;
        if (gioBDSD == null) {
            if (other.gioBDSD != null)
                return false;
        } else if (!gioBDSD.equals(other.gioBDSD))
            return false;
        if (maKH == null) {
            if (other.maKH != null)
                return false;
        } else if (!maKH.equals(other.maKH))
            return false;
        if (maMay == null) {
            if (other.maMay != null)
                return false;
        } else if (!maMay.equals(other.maMay))
            return false;
        if (ngayBDSD == null) {
            if (other.ngayBDSD != null)
                return false;
        } else if (!ngayBDSD.equals(other.ngayBDSD))
            return false;
        return true;
    }

}
