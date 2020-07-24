package tuanbtd.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tuanbtd.app.entity.DichVu;
import tuanbtd.app.model.Search;
import tuanbtd.app.service.DichVuService;

@Controller
@RequestMapping(value = "/dichVu")
public class DichVuController {

    // Danh sach ten cac file JSP liên quan đến Dịch vụ
    private static final String FILE_LIST_DV = "list-dichvu";
    private static final String FILE_EDIT_DV = "edit-dichvu";
    private static final String FILE_ADD_DV = "add-dichvu";

    @Autowired
    private DichVuService dichVuService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addDV(Model model) {
        model.addAttribute("dichVu", new DichVu());
        return FILE_ADD_DV;
    }

    @RequestMapping(value = "/add-action", method = RequestMethod.POST)
    public String addActionDV(@ModelAttribute("dichVu") DichVu dichVu) {
        dichVuService.createDichVu(dichVu);
        return "redirect:/dichVu/list";
    }

    @RequestMapping(value = "/edit/{maDV}", method = RequestMethod.GET)
    public String editDV(@PathVariable("maDV") String maDV, Model model) {
        DichVu dichVu = dichVuService.getDVByMaDV(maDV);
        model.addAttribute("dichVu", dichVu);
        return FILE_EDIT_DV;
    }

    @RequestMapping(value = "/edit-action", method = RequestMethod.POST)
    public String editActionDV(@ModelAttribute("dichVu") DichVu dichVu) {
        dichVuService.editDichVu(dichVu);
        return "redirect:/dichVu/list";
    }

    @RequestMapping(value = "/delete/{maDV}", method = RequestMethod.GET)
    public String deleteDVByMaDV(@PathVariable("maDV") String maDV) {
        dichVuService.deleteDichVu(maDV);
        return "redirect:/dichVu/list";
    }

    /** Trang danh sách Dịch Vụ. */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String danhSachDV(Model model) {
        List<DichVu> listDV = dichVuService.getAllDichVu();
        model.addAttribute("listDV", listDV);
        model.addAttribute("search", new Search());
        return FILE_LIST_DV;
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String danhSachKH(@ModelAttribute("search") Search search, Model model) {
        String content = search.getContent();
        List<DichVu> listDV = dichVuService.searchDVByFullAttribute(content);
        model.addAttribute("listDV", listDV);
        return FILE_LIST_DV;
    }
}
