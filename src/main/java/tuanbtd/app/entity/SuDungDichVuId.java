/**
 *@author TuanBTD
 *@date Dec 27, 2019
 *@version version
 */

package tuanbtd.app.entity;

import java.io.Serializable;
import java.util.Date;

public class SuDungDichVuId implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private KhachHang maKH;

    private DichVu maDV;

    private Date ngaySD;

    private String gioSD;

    public SuDungDichVuId(KhachHang maKH, DichVu maDV, Date ngaySD, String gioSD) {
        super();
        this.maKH = maKH;
        this.maDV = maDV;
        this.ngaySD = ngaySD;
        this.gioSD = gioSD;
    }

    public SuDungDichVuId() {
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((gioSD == null) ? 0 : gioSD.hashCode());
        result = prime * result + ((maDV == null) ? 0 : maDV.hashCode());
        result = prime * result + ((maKH == null) ? 0 : maKH.hashCode());
        result = prime * result + ((ngaySD == null) ? 0 : ngaySD.hashCode());
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
        SuDungDichVuId other = (SuDungDichVuId) obj;
        if (gioSD == null) {
            if (other.gioSD != null)
                return false;
        } else if (!gioSD.equals(other.gioSD))
            return false;
        if (maDV == null) {
            if (other.maDV != null)
                return false;
        } else if (!maDV.equals(other.maDV))
            return false;
        if (maKH == null) {
            if (other.maKH != null)
                return false;
        } else if (!maKH.equals(other.maKH))
            return false;
        if (ngaySD == null) {
            if (other.ngaySD != null)
                return false;
        } else if (!ngaySD.equals(other.ngaySD))
            return false;
        return true;
    }

}
