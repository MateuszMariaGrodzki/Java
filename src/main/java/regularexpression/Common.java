package regularexpression;

import java.util.regex.Pattern;

public class Common {

    public boolean isEmailCorrect(String email){
        Pattern pattern = Pattern.compile("[a-zA-Z0-9] + [\\.a-zA-Z0-9]*@[a-zA-Z0-9]+\\.[a-z]{2,}[a-z]*");
        return pattern.matcher(email).matches();
    }
}
