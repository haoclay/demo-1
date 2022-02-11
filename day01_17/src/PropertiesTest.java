import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) {
         //储物柜  A
        Properties A = new Properties();
         //放衣服到 A03
        A.setProperty("A03","衣服");
        A.setProperty("A12","iphone 13");
        //取衣服
        //打印
        System.out.println(A.get("A03"));

        System.out.println(A.get("A12"));

    }
}
