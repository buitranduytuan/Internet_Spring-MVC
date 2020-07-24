package tuanbtd.app.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tuanbtd.app.entity.DichVu;
import tuanbtd.app.entity.KhachHang;
import tuanbtd.app.entity.SuDungDichVu;
import tuanbtd.app.model.SuDungDichVuInfoModel;
import tuanbtd.app.model.SuDungDichVuModel;
import tuanbtd.app.service.DichVuService;
import tuanbtd.app.service.KhachHangService;
import tuanbtd.app.service.SuDungDichVuService;
import tuanbtd.app.validator.Validate;

@Controller
public class SuDungDichVuController {

    /*
     * @Autowired private SuDungDichVuService suDungDichVuService;
     */

    private static final String FILE_DK_DICHVU = "dangky-sudung-dichvu";

    @Autowired
    private SuDungDichVuService suDungDichVuService;

    @Autowired
    private DichVuService dichVuService;

    @Autowired
    private KhachHangService khachHangService;

    @RequestMapping("/formDKSDDV")
    public String dangKyDV(Model model) {
        model.addAttribute("dangKyDV", new SuDungDichVuModel());
        model.addAttribute("listMaDV", dichVuService.getAllMaDV());
        model.addAttribute("listMaKH", khachHangService.getAllMaKH());
        return FILE_DK_DICHVU;
    }

    @RequestMapping(value = "/DKSDDV-action", method = RequestMethod.POST)
    public String dKSDDV(@ModelAttribute("dangKyDV") SuDungDichVuModel sddvModel, Model model) {

        KhachHang khachHang = new KhachHang(sddvModel.getMaKH());
        DichVu dichVu = dichVuService.getDVByMaDV(sddvModel.getMaDV());
        Date ngaySD = Validate.parseStringToDate(sddvModel.getNgaySD());
        SuDungDichVu suDungDichVu = new SuDungDichVu(khachHang, dichVu, ngaySD, sddvModel.getGioSD(),
                sddvModel.getSoLuong());

        suDungDichVuService.dangKySuDungDichVu(suDungDichVu);

        return "redirect:/may/list";
    }


    @RequestMapping(value = "/DKSDDV-list", method = RequestMethod.GET)
    public String getDKSDDVInfo(Model model) {
        List<SuDungDichVuInfoModel> listInfo = suDungDichVuService.getListSDDV();
        model.addAttribute("listInfo", listInfo);
        return "list-info"; 
    }

}
