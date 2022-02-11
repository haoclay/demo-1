import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class MailTest {

    //程序的入口 程序开关
    public static void main(String[] args) throws MessagingException {
        //创建一个用来登录的记事本
        Properties from = new Properties();
        //设置邮箱服务器地址
        from.setProperty("foxmail.host","smtp.qq.com");
        //设置邮箱账号
        from.setProperty("foxmail.host.mail","1853737225@qq.com");
        //设置邮箱密码 -> 授权码
        from.setProperty("foxmail.smtp.pwd","zlmsknjevnbkdcad");
        //设置smtp传输协议
        from.setProperty("foxmail.transport.protocol","smtp");

        //接收者信息
        Properties to = new Properties();
        //配置接收者的邮箱账号
        to.setProperty("mail_target","1140384313@qq.com");
        //配置标题
        to.setProperty("mail_title","欢迎大家");
        //配置内容
        to.setProperty("mail_content","来到乐学优课公开课~~");

        //把接收者信息和发送者的信息交给邮递员 => 信封
        Map envelope = MailConfig.config(from, to);
         //发送
        MailConfig.send(envelope);

    }
}
