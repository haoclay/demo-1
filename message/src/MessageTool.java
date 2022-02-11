import com.zhenzi.sms.ZhenziSmsClient;

import java.util.HashMap;
import java.util.Map;

public class MessageTool {
        //连接网络短信服务器
        private static ZhenziSmsClient client = new ZhenziSmsClient("https://sms_developer.zhenzikj.com","102898","3502fc2f-4aea-4899-aa90-766efa59cc8d");

        public static void main(String [] args) throws Exception {
            //记事本存放三种信息 ==>数据，模板，手机号
            Map to = new HashMap<>();

            String[] templateParams = {"9527"};
            // 模板id
            to.put("templateId","3873");
            // 模板数据
            to.put("templateParams", templateParams);
            // 手机号码
            to.put("number","15607140140");

            String result = client.send(to);

            System.out.println(result);

        }


}
