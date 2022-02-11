import java.util.Properties;

public class PropertiesTest {

    //程序的入口
    public static void main(String[] args) {

        Properties A = new Properties();
        Properties B= new Properties();
        //往A储物柜  A03号箱子存衣服
        A.setProperty("A03","衣服");

        A.setProperty("A12","iphone 13 plus");

        System.out.println( A.getProperty("A12"));

        System.out.println(A.get("A03"));

        System.out.println(B.get("A12"));
    }
}
