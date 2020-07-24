/*
 *@user: TuanBTD
 *@date: Feb 5, 2020
 */

package tuanbtd.app.validator;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Validate {

    public static boolean validateNumber(String numberSt) {
        boolean check = true;
        try {
            Integer.parseInt(numberSt);
        } catch (Exception e) {
            check = false;
            e.printStackTrace();
        }
        return check;
    }

    public static boolean validateMaKH(String maKH) {
        // KH00001
        boolean check = false;
        if (maKH.length() == 7) {
            String x = maKH.substring(0, 2);
            String y = maKH.substring(2, 7);
            if (x.equals("KH") && validateNumber(y)) {
                check = true;
            }
        }
        return check;
    }

    public static boolean validateMaMay(String maMay) {
        // MAY0001
        boolean check = false;
        if (maMay.length() == 7) {
            String x = maMay.substring(0, 3);
            String y = maMay.substring(3, 7);
            if (x.equals("MAY") && validateNumber(y)) {
                check = true;
            }
        }
        return check;
    }

    public static boolean validatePhone(String phone) {
        boolean check = false;

        // cac dau so bat dau : 091 - 090
        if (phone.length() == 10 && validateNumber(phone)) {
            String dauSo = phone.substring(0, 3);
            if (dauSo.equals("090") || dauSo.equals("091")) {
                check = true;
            }
        }

        // (84)+90xxxxxxx or (84)+91xxxxxxx
        if (phone.length() == 14) {
            String dauSo = phone.substring(0, 7);
            String duoi = phone.substring(7, 14);
            if (dauSo.equals("(84)+90") || dauSo.equals("(84)+91")) {
                if (validateNumber(duoi)) {
                    check = true;
                }
            }
        }

        return check;
    }

    // String emailPattern =
    // "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
    // @gmail.com.vn hoac @gmail.com 1,2,3 [.] van dc
    // String emailPattern = "\\w+@\\w+[.]\\w+"; chi duoc 1 [.]; truong hop cho co
    // dinh.. muon nhieu thi viet them
    public static boolean validateEmail(String email) {
        boolean check = false;
        String emailPattern = "\\w+@\\w+[.]\\w+";
        check = email.matches(emailPattern);
        return check;
    }

    // OK
    public static boolean validateDate(String date) {
        boolean check = false;
        String[] splitValues = date.split("/");
        if (splitValues.length == 3) {
            try {
                int day = Integer.parseInt(splitValues[0]);
                int month = Integer.parseInt(splitValues[1]);
                int year = Integer.parseInt(splitValues[2]);
                LocalDate.of(year, month, day);
                check = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return check;
    }

    public static Date parseStringToDate(String date) {
        String[] splitValues = date.split("/");
        int day = Integer.parseInt(splitValues[0]);
        int month = Integer.parseInt(splitValues[1]);
        int year = Integer.parseInt(splitValues[2]);
        LocalDate localDate = LocalDate.of(year, month, day);
        Date dateok = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return dateok;
    }
    
}
