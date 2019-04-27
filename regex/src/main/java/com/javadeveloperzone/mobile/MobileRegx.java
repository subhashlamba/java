package main.java.com.javadeveloperzone.mobile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author subhash lamba
 */
public class MobileRegx {

    public static final Pattern MOBILE_REGX = Pattern.compile("^(\\+?\\d{2})?(\\s+)?(\\d{10})\\b");//. represents single character

    public static void main(String[] args){

        System.out.println(isValidMobileNo("0123456789"));                  // true
        System.out.println(isValidMobileNo("+91 0123456789"));              // true
        System.out.println(isValidMobileNo("91 0123456789"));              // true
        System.out.println(isValidMobileNo("+910123456789"));               // true
        System.out.println(isValidMobileNo("+91          0123456789"));     // true

        System.out.println(isValidMobileNo("0123456789000"));                  // false
        System.out.println(isValidMobileNo("0123 456 789"));                  // false

    }
    public static boolean isValidMobileNo(String mobileNo){
        Matcher matcher = MOBILE_REGX.matcher(mobileNo);
        return matcher.matches();
    }
}

