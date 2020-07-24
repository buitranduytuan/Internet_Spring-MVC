package tuanbtd.app.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tuanbtd.app.entity.KhachHang;
import tuanbtd.app.entity.May;
import tuanbtd.app.entity.SuDungMay;
import tuanbtd.app.model.SuDungMayModel;
import tuanbtd.app.service.KhachHangService;
import tuanbtd.app.service.MayService;
import tuanbtd.app.service.SuDungMayService;
import tuanbtd.app.validator.Validate;

@Controller
public class SuDungMayController {

    /*
     * @Autowired private SuDungDichVuService suDungDichVuService;
     */

    private static final String FILE_DK_MAY = "dangky-sudung-may";

    @Autowired
    private SuDungMayService suDungMayService;

    @Autowired
    private MayService mayService;

    @Autowired
    private KhachHangService khachHangService;

    @RequestMapping("/formDKSDMay")
    public String dangKyMay(Model model) {
        model.addAttribute("dangKyMay", new SuDungMayModel());
        model.addAttribute("listMaMay", mayService.getAllMaMayDangRanh());
        model.addAttribute("listMaKH", khachHangService.getAllMaKH());
        return FILE_DK_MAY;
    }

    @RequestMapping(value = "/DKSDMay-action", method = RequestMethod.POST)
    public String dKSDMay(@ModelAttribute("dangKyMay") SuDungMayModel sdmayModel) {

        KhachHang khachHang = new KhachHang(sdmayModel.getMaKH());
        May may = mayService.getMayByMaMay(sdmayModel.getMaMay());
        may.setTrangThai("Có ngư�?i dùng");
        mayService.editMay(may);
        Date ngayBDSD = Validate.parseStringToDate(sdmayModel.getNgayBDSD());
        SuDungMay suDungMay = new SuDungMay(khachHang, may, ngayBDSD, sdmayModel.getGioBDSD(),
                sdmayModel.getThoiGianSD());

        suDungMayService.dangKySuDungMay(suDungMay);

        return "redirect:/may/list";
    }

    /*
     * @RequestMapping(value = "/DKSDDV-list", method = RequestMethod.POST) public
     * String getDanhSachDKSDDV(Model model) { List<SuDungDichVu> listSDDV =
     * suDungDichVuService.getAllDangKyDV(); model.addAttribute("listSDDV",
     * listSDDV); return FILE_DS_SDDV; }
     */
}
