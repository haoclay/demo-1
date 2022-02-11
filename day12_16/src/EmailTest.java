import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class EmailTest {

    //程序的入口
    public static void main(String[] args) throws MessagingException {
        //配置发送者的信息
        Properties from = new Properties(){{
            //配置QQ邮箱的服务器地址
            setProperty("foxmail.host","smtp.qq.com");
            //配置QQ邮箱账号
            setProperty("foxmail.host.mail","1853737225@qq.com");
            //配置QQ邮箱的密码(授权码)
            setProperty("foxmail.smtp.pwd","uwnohlcgqbqmbieg");
            //配置传输协议
            setProperty("foxmail.transport.protocol","smtp");

        }};

        //配置接收者的信息
        Properties to = new Properties(){{
            //配置接收者的邮箱地址
            setProperty("mail_target","837783587@qq.com");
            //配置一个主题
            setProperty("mail_title","哈哈");
           //配置正文
            setProperty("mail_content","我学习java好开心呀");

        }};
         //整合接收者发送者信息，相当于把信纸塞进信封里面
        Map config = MailConfig.config(from, to);
        //把信封交给邮递员
        MailConfig.send(config);
    }
}
