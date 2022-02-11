import java.util.Random;

public class CodeTool {

    public static String createCode(){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(random.nextInt(10));
        }
        String code = sb.toString();
        System.out.println("验证码:"+code);
        return code;
    }

    public static boolean isSuccessful(String result){

        if(result.charAt(8)=='0'){
           return true;
        }else {
            return false;
        }
    }

}
