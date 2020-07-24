package tuanbtd.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tuanbtd.app.entity.May;
import tuanbtd.app.model.Search;
import tuanbtd.app.service.MayService;
import tuanbtd.app.validator.MayValidator;

@Controller
@RequestMapping(value = "/may")
public class MayController {

    // Danh sach ten cac file JSP liên quan đến Máy
    private static final String FILE_LIST_MAY = "list-may";
    private static final String FILE_EDIT_MAY = "edit-may";
    private static final String FILE_ADD_MAY = "add-may";

    @Autowired
    private MayService mayService;

    @Autowired
    private MayValidator mayValidator;

    @InitBinder("may")
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(mayValidator);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addMay(Model model) {
        model.addAttribute("may", new May());
        return FILE_ADD_MAY;
    }

    @RequestMapping(value = "/add-action", method = RequestMethod.POST)
    public String addActionMay(@Valid @ModelAttribute("may") May may, BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("may", may);
            return FILE_ADD_MAY;
        }

        mayService.createMay(may);
        return "redirect:/may/list";
    }

    @RequestMapping(value = "/edit/{maMay}", method = RequestMethod.GET)
    public String editMay(@PathVariable("maMay") String maMay, Model model) {
        May may = mayService.getMayByMaMay(maMay);
        model.addAttribute("may", may);
        return FILE_EDIT_MAY;
    }

    @RequestMapping(value = "/edit-action", method = RequestMethod.POST)
    public String editActionMay(@Valid @ModelAttribute("may") May may, BindingResult result, Model model) {

        mayService.editMay(may);
        return "redirect:/may/list";
    }

    @RequestMapping(value = "/delete/{maMay}", method = RequestMethod.GET)
    public String deleteMayByMaMay(@PathVariable("maMay") String maMay) {
        mayService.deleteMay(maMay);
        return "redirect:/may/list";
    }

    /** Trang danh sách Máy. */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String danhSachMay(Model model) {
        List<May> listMay = mayService.getAllMay();
        model.addAttribute("listMay", listMay);
        model.addAttribute("search", new Search());
        return FILE_LIST_MAY;
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String danhSachKH(@ModelAttribute("search") Search search, Model model) {
        String content = search.getContent();
        List<May> listMay = mayService.searchMayByFullAttribute(content);
        model.addAttribute("listMay", listMay);
        return FILE_LIST_MAY;
    }
}
