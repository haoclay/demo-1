import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class MailTest {

    //程序的入口
    public static void main(String[] args) throws MessagingException {
        //配置登陆者的信息
        Properties from = new Properties();
        //配置QQ邮箱服务器地址
        from.setProperty("foxmail.host","smtp.qq.com");
        //配置QQ邮箱账号
        from.setProperty("foxmail.host.mail","1853737225@qq.com");
        //配置密码 ->授权码
        from.setProperty("foxmail.smtp.pwd","spphxewuoahmfaef");
        //配置传输协议
        from.setProperty("foxmail.transport.protocol","smtp");

        //配置接收方的信息
        Properties to = new Properties();
        //配置接收方的邮箱账号
        to.setProperty("mail_target","1742210194@qq.com");
         //主题是啥
        to.setProperty("mail_title","欢迎大家");
        //正文是啥
        to.setProperty("mail_content","欢迎大家来到乐学优课~~");

        //把储物柜交给邮递员 邮递员会把他变成一个信封
        Map envelope = MailConfig.config(from, to);
        //把信封交给邮递员发送

        MailConfig.send(envelope);



    }
}
