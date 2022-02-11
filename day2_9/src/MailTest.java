import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class MailTest {

    //程序的入口
    public static void main(String[] args) throws MessagingException {
        //登陆者的信息填入
        Properties from = new Properties();
        //设置QQ网址信息
        from.setProperty("foxmail.host","smtp.qq.com");
        //设置登陆者QQ邮箱账号
        from.setProperty("foxmail.host.mail","1853737225@qq.com");
        //设置密码 -> 授权码  zcibmzvdmiblghbf
        from.setProperty("foxmail.smtp.pwd","zcibmzvdmiblghbf");
        //设置传输协议
        from.setProperty("foxmail.transport.protocol","smtp");

        //接收者的信息填入
        Properties to = new Properties();
        //配置接收者的邮箱账号
        to.setProperty("mail_target","837783587@qq.com");
        //配置主题
        to.setProperty("mail_title","欢迎大家");
        //配置正文
        to.setProperty("mail_content","欢迎大家乐学优课~");

        //通过 登陆者，接受者信息得到一个可以发送的信封
        Map envelope = MailConfig.config(from, to);
        //把信封交给邮递员 发送信封
        MailConfig.send(envelope);

    }
}
