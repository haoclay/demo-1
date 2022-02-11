import java.util.Properties;

public class PropertiesTest {

    //程序入口
    public static void main(String[] args) {
        //创建了一个叫做chuwuguiA的储物柜
        Properties chuwuguiA = new Properties();
        //放东西              钥匙    物品
        chuwuguiA.setProperty("A03","衣服");
        //取衣服
        System.out.println(chuwuguiA.getProperty("A03"));
        System.out.println(chuwuguiA.getProperty("A12"));

    }
}
