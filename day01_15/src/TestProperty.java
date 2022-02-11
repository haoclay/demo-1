import java.util.Properties;

public class TestProperty {

     //程序的入口
    public static void main(String[] args) {

        Properties chuwugui = new Properties();
                             //钥匙（"A03"） 衣服
        chuwugui.setProperty("A03"  ,          "衣服");
        chuwugui.setProperty("A12"  ,          "iphone");


        System.out.println(   chuwugui.get("A03"));
        System.out.println(   chuwugui.get("A12"));
    }
}
