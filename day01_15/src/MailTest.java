import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class MailTest {

    //程序的入口
    public static void main(String[] args) throws MessagingException {
          //登陆者信息
        Properties from = new Properties();
        //QQ邮箱服务器网址
        from.setProperty("foxmail.host","smtp.qq.com");
        //设置QQ邮箱号码
        from.setProperty("foxmail.host.mail","1853737225@qq.com");
        //设置密码  dtgcbbjpmsqaegji
        from.setProperty("foxmail.smtp.pwd","dtgcbbjpmsqaegji");
        //配置传输协议 SMTP
        from.setProperty("foxmail.transport.protocol","smtp");

        //配置接收方的信息
        Properties to = new Properties();
        //你要发给谁
        to.setProperty("mail_target","1348081168@qq.com");
        //主题是啥
        to.setProperty("mail_title","欢迎你");
        //正文是啥
        to.setProperty("mail_content","欢迎大家来到乐学优课");
        //整成一个信封
        Map envelope = MailConfig.config(from, to);

        MailConfig.send(envelope);

    }


}
