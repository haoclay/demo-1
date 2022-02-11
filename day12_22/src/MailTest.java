import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class MailTest {
    //程序的入口
    public static void main(String[] args) throws MessagingException {
        //创建一个记事本=>配置登陆者的信息
        Properties from = new Properties(){{
            //配置QQ邮箱服务器地址
            setProperty("foxmail.host","smtp.qq.com");
            //配置QQ邮箱账号
            setProperty("foxmail.host.mail","1853737225@qq.com");
            //配置密码 ==> 授权码
            setProperty("foxmail.smtp.pwd","crqylfqpmfbsddhg");
            //配置smtp传输协议
            setProperty("foxmail.transport.potocol","smtp");
        }};

        //配置收件人的信息
        Properties to = new Properties(){{
            //配置接收者QQ邮箱账号 =>发送给谁
            setProperty("mail_target","837783587@qq.com");
           //配置邮件主题
            setProperty("mail_title","欢迎来到乐学优课");
            //配置正文
            setProperty("mail_content","欢迎欢迎,热烈欢迎");
        }};
        //邮递员要求给我一个接收者和发送者的信息=>整合成信封
        Map config = MailConfig.config(from, to);
        //接下来把信件交给邮递员
        MailConfig.send(config);
    }
}
