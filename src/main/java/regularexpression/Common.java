package regularexpression;

import java.util.regex.Pattern;

public class Common {

    public boolean isEmailCorrect(String email){
        Pattern pattern = Pattern.compile("[a-zA-Z0-9] + [\\.a-zA-Z0-9]*@[a-zA-Z0-9]+\\.[a-z]{2,}[a-z]*");
        return pattern.matcher(email).matches();
    }

    public boolean isPostCodeCorrect(String code){
        Pattern pattern = Pattern.compile("\\d{2}-\\d{3}");
        return pattern.matcher(code).matches();
    }

    public boolean isPasswordCorrect(String password){
        Pattern pattern = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])" +
                "(?=.[\\!\\@\\#\\$\\%\\^\\&\\*])(?!=.*\\s).{8,15}");
        return pattern.matcher(password).matches();
    }


}
