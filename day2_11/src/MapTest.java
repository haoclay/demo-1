import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        //创建了一个叫做chuwugui的柜子
       Map chuwugui  = new HashMap<>();
       //把衣服存到 储物柜
        chuwugui.put("A03","衣服");
        chuwugui.put("A12","13香");
        // 取衣服
        String yifu = (String) chuwugui.get("A12");

        System.out.println(yifu);

    }
}
