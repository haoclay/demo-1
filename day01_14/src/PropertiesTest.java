import java.util.Properties;

public class PropertiesTest {

    //程序的入口 -> 帮你编译代码 ->帮你把代码运行了
    public static void main(String[] args) {
                    //储物柜的名字 properties
        Properties properties = new Properties();
                   //往储物柜放东西的方法
        properties.setProperty("手机的钥匙","手机");

        System.out.println(properties.get("拖拉机的钥匙"));

    }
}
