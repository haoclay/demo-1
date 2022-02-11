import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class EmailTest {

    //程序的入口
    public static void main(String[] args) throws MessagingException {
        //发送者的储物柜
        Properties from = new Properties();
        //QQ邮箱服务器网址的信息
        from.setProperty("foxmail.host","smtp.qq.com");
        //配置发送者邮箱（登录者邮箱）
        from.setProperty("foxmail.host.mail","1853737225@qq.com");
        //配置密码 ->授权码
        from.setProperty("foxmail.smtp.pwd","lqbnotrqpebcdada");
        //配置传输协议 smtp
        from.setProperty("foxmail.transport.protocol","smtp");

        //接收者的储物柜
        Properties to = new Properties();
        //配置接收者的邮箱
        to.setProperty("mail_target","2049806236@qq.com");
        //配置标题
        to.setProperty("mail_title","欢迎大家");
        //配置正文
        to.setProperty("mail_content","欢迎大家来到乐学优课");

        //把储物柜的信息交给邮箱服务器 ->产生一个信封
        Map envelope = MailConfig.config(from, to);
        //把信封交给邮递员去发送
        MailConfig.send(envelope);

    }
}
