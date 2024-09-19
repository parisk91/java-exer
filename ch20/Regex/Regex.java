package gr.aueb.cf.ch20.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {


    public static void main(String[] args) {
        String password = "Panathinaikos1908@";
        //boolean answer = checkPassword(password);
        //System.out.println(answer);

        Pattern pattern = Pattern.compile("/^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,}$/");
        Matcher matcher = pattern.matcher(password);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }

//    public static boolean checkPassword(String pass) {
//        return (pass.matches("\\w{8,}") & pass.matches("[a-z]{1,}")
//                & pass.matches("[A-Z]{1,}") & pass.matches("\\d{1,}")
//        & pass.matches("[#?!@$%^&*-]{1,}"));
//    }

}
