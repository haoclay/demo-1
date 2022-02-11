import java.util.Properties;

public class PropertiesTest {

    //程序的入口 程序的开关
    public static void main(String[] args) {
        //创建一个叫做chuwugui的储物柜
        Properties chuwugui = new Properties();
        //往储物柜里放东西    钥匙(key)  衣服(value)
        chuwugui.setProperty( "A03"    ,  "衣服");
        //往储物柜里拿回东西
        chuwugui.getProperty("A03");
        //打印
        System.out.println(chuwugui.getProperty("A03"));
        System.out.println(chuwugui.getProperty("A12"));
    }
}
