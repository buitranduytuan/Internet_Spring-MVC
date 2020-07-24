package tuanbtd.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tuanbtd.app.entity.KhachHang;
import tuanbtd.app.model.Search;
import tuanbtd.app.service.KhachHangService;

@Controller
@RequestMapping(value = "/khachHang")
public class KhachHangController {

    // Danh sach ten cac file JSP liên quan đến Máy
    private static final String FILE_LIST_KH = "list-khachhang";
    private static final String FILE_EDIT_KH = "edit-khachhang";
    private static final String FILE_ADD_KH = "add-khachhang";

    @Autowired
    private KhachHangService khachHangService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addKH(Model model) {
        model.addAttribute("khachHang", new KhachHang());
        return FILE_ADD_KH;
    }

    @RequestMapping(value = "/add-action", method = RequestMethod.POST)
    public String addActionMay(@ModelAttribute("khachHang") KhachHang khachHang) {
        khachHangService.createKhachHang(khachHang);
        return "redirect:/khachHang/list";
    }

    @RequestMapping(value = "/edit/{maKH}", method = RequestMethod.GET)
    public String editKH(@PathVariable("maKH") String maKH, Model model) {
        KhachHang khachHang = khachHangService.getKHByMaKH(maKH);
        model.addAttribute("khachHang", khachHang);
        return FILE_EDIT_KH;
    }

    @RequestMapping(value = "/edit-action", method = RequestMethod.POST)
    public String editActionKH(@ModelAttribute("khachHang") KhachHang khachHang) {
        khachHangService.editKhachHang(khachHang);
        return "redirect:/khachHang/list";
    }

    @RequestMapping(value = "/delete/{maKH}", method = RequestMethod.GET)
    public String deleteKHByMaKH(@PathVariable("maKH") String maKH) {
        khachHangService.deleteKhachHang(maKH);
        return "redirect:/khachHang/list";
    }

    /** Trang danh sách Máy. */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String danhSachKH(Model model) {
        List<KhachHang> listKH = khachHangService.getAllKhachHang();
        model.addAttribute("listKH", listKH);
        model.addAttribute("search", new Search());
        return FILE_LIST_KH;
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String danhSachKH(@ModelAttribute("search") Search search, Model model) {
        String content = search.getContent();
        List<KhachHang> listKH = khachHangService.searchKhachHangFullAttribute(content);
        model.addAttribute("listKH", listKH);
        return FILE_LIST_KH;
    }

    /*
     * @RequestMapping(value = "/listThongTin", method = RequestMethod.GET) public
     * String listThongTin(Model model) { List<ThongTinDangKySuDung> listThongTin =
     * khachHangService.getAllThongTinSD();
     * 
     * model.addAttribute("listThongTin", listThongTin); return FILE_LIST_THONGTIN;
     * 
     * System.out.println(listThongTin.toString()); return FILE_LIST_KH; }
     */
}
