import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class MailTest {

     //程序的入口
    public static void main(String[] args) throws MessagingException {
       //下面的代码相当于把电路走通
        //登陆者的信息，即发送者的信息
        Properties from = new Properties(){{
            //提示填写一个QQ邮箱的服务其地址
            setProperty("foxmail.host","smtp.qq.com");
            //提示填写一个登陆者的QQ邮箱
            setProperty("foxmail.host.mail","1853737225@qq.com");
            //提示填写QQ密码。其实是一个授权码 rsiltfjztlkxbecb
            setProperty("foxmail.smtp.pwd","rsiltfjztlkxbecb");
            //提示填写传输协议
            setProperty("foxmail.transport.protocol","smtp");
        }};

         //接收者信息
        Properties to = new Properties(){{
            //接收者的QQ邮箱
            setProperty("mail_target","837783587@qq.com");
            //标题是啥
            setProperty("mail_title","欢迎大家来到乐学优课...");
            //标题是啥
            setProperty("mail_content","欢迎欢迎 热烈欢迎...");
        }};
         //整合接收者发送者的信息，然后把信件塞进信封。
        Map config = MailConfig.config(from, to);
         //把信封交给邮递员
        MailConfig.send(config);
    }
}
