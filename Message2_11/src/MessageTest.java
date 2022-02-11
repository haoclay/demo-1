import com.zhenzi.sms.ZhenziSmsClient;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MessageTest {
    public static void main(String[] args) throws Exception {

        ZhenziSmsClient client = new ZhenziSmsClient("http://sms_developer.zhenzikj.com/","102898","3502fc2f-4aea-4899-aa90-766efa59cc8d");

        Map map = new HashMap<>();

        Random random = new Random();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int num = random.nextInt(10);
            sb.append(num);
        }

        String  [] params = {sb.toString()};

        map.put("number","15607140140");

        map.put("templateId","3873");

        map.put("templateParams",params);

        String result = client.send(map);

        System.out.println(result);

    }
}
