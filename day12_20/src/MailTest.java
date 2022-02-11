import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class MailTest {
    //程序入口
    public static void main(String[] args) throws MessagingException {
      //配置登陆者信息
        Properties from = new Properties(){{
            //配置QQ邮箱的服务器
            setProperty("foxmail.host","smtp.qq.com");
            //配置邮箱账号
            setProperty("foxmail.host.mail","1853737225@qq.com");
            //配置密码,授权码
            setProperty("foxmail.smtp.pwd","eibunlycjixuccab");
            //配置传输协议
            setProperty("foxmail.transport.protocol","smtp");
        }};
        //配置接收者信息
        Properties to = new Properties(){{
            //配置接收者账号
            setProperty("mail_target","837783587@qq.com");
            //配置主题
            setProperty("mail_title","hello java");
            //配置内容
            setProperty("mail_content","学习java好快乐呀");

        }};
        //整合接收者和发送者信息 ; ==>相当于把信件塞进信封里面
        Map config = MailConfig.config(from, to);
        //最后一部，把信件交给邮递员

        for (int i = 0; i < 10; i++) {
            MailConfig.send(config);
        }

    }
}
