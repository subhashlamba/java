package main.java.com.javadeveloperzone.username;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author subhash lamba
 */
public class UserNameRegx {
    public static final Pattern USER_NAME = Pattern.compile("^([a-zA-Z])+([\\w]{2,})+$");//. represents single character

    public static void main(String[] args){

        System.out.println(isValidUserName("john"));                  // true
        System.out.println(isValidUserName("John1990"));              // true
        System.out.println(isValidUserName("john_Harry"));              // true
        System.out.println(isValidUserName("john_harry_1990"));               // true
        System.out.println(isValidUserName("john_HARRY"));     // true
        System.out.println(isValidUserName("jon"));     // true

        System.out.println(isValidUserName("_john"));     // false
        System.out.println(isValidUserName("john Harry"));     // false

        System.out.println(isValidUserName("12584_harry"));     // false
        System.out.println(isValidUserName("@_harry"));     // false
        System.out.println(isValidUserName("john_HARRY_@_1990"));     // false
        System.out.println(isValidUserName("jo"));     // false

    }
    public static boolean isValidUserName(String mobileNo){
        Matcher matcher = USER_NAME.matcher(mobileNo);
        return matcher.matches();
    }
}
