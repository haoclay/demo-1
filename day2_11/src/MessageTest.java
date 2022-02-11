import com.zhenzi.sms.ZhenziSmsClient;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MessageTest {

    //程序的入口
    public static void main(String[] args) throws Exception {
        //创建了一个可以产生随机数的工具
        Random random = new Random();

        //拼接数据
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            //产生随机数
            int num = random.nextInt(10);//[0~10]
            //每次产生的随机数粘在后面
            sb.append(num);
        }
        System.out.println(sb.toString());
     //////////////////////////////////////////////////////
        //专门发短信用的客户端
        //你要到哪个网络短信服务器登录账号
        ZhenziSmsClient client = new ZhenziSmsClient("http://sms_developer.zhenzikj.com/",
                "","");
             //创建一个储物柜，用来存数据
             Map map = new HashMap<>();
             //配置短信发给谁  手机号
             map.put("number","15607140140");
             //配置发送内容
             String [] templateParams = {sb.toString()};

             map.put("templateParams",templateParams);
             //配置模板
             map.put("templateId","3873");
            //发送
            String result = client.send(map);
            //答应发送结果信息
            System.out.println(result);

    }
}
