package PHAN1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class XDate {
    private static SimpleDateFormat formater = new SimpleDateFormat();
    public static Date parse(String text, String pattern) throws RuntimeException{
        try {
            formater.applyPattern(pattern);
            return formater.parse(text);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Date parse(String text) throws RuntimeException{
        return XDate.parse(text,"dd-MM-yyyy");
    }
}
