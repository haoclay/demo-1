import java.util.Properties;

public class Test {
    //Properties => (key ：value)
//                  钥匙 ：书包衣服（你要存的东西）

    //程序的入口 程序开关
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("haha","我是一件衣服");

        System.out.println(properties.get("haha33"));
        //null 空 -
    }
}
