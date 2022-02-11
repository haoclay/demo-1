import java.util.Properties;

public class PropertiesTest {

    //
    public static void main(String[] args) {
//        Properties  (key : value) =>
        //             钥匙 ：衣服

        Properties chuwugui = new Properties();
        chuwugui.setProperty("钥匙","裤子");
        chuwugui.setProperty("钥匙1","衣服");

        System.out.println(chuwugui.get("钥匙"));
        System.out.println(chuwugui.get("钥匙1"));
    }
}
