package tuanbtd.app.validator;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import tuanbtd.app.entity.May;
import tuanbtd.app.service.MayService;

@Component
public class MayValidator implements Validator {

    @Autowired
    MayService mayService;

    @Override
    public boolean supports(Class<?> clazz) {
        return May.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        May may = (May) target;

        if (mayService.isExist(may.getMaMay())) {
            errors.rejectValue("maMay", "maMay.exits");
        }

        if (may.getMaMay().equalsIgnoreCase("")) {
            errors.rejectValue("maMay", "maMay.rong");
        } else {
            if (!Pattern.matches("^MAY\\d{4}$", may.getMaMay())) {
                errors.rejectValue("maMay", "maMay.format");
            }
        }

        if (may.getViTri().equalsIgnoreCase("")) {
            errors.rejectValue("viTri", "viTri.rong");
        }

        if (may.getTrangThai().equalsIgnoreCase("")) {
            errors.rejectValue("trangThai", "trangThai.rong");
        }
    }
}
