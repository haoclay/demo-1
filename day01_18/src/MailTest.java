import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class MailTest {

     //程序的入口
    public static void main(String[] args) throws MessagingException {
        //配置登陆者信息
        Properties from = new Properties();
        //配置QQ邮箱服务器网址
        from.setProperty("foxmail.host","smtp.qq.com");
        //配置账号
        from.setProperty("foxmail.host.mail","837783587@qq.com");
        //配置密码 ->授权码
        from.setProperty("foxmail.smtp.pwd","ladjktuicgtabeab");
        //配置传输协议
        from.setProperty("foxmail.transport.protocol","smtp");

        //配置接收者信息
        Properties to = new Properties();
        //发给谁?
        to.setProperty("mail_target","519877576@qq.com");
        //配置主题
        to.setProperty("mail_title","欢迎你");
        //配置正文
        to.setProperty("mail_content","欢迎你来到乐学优课");

        //邮递员 把两个储物柜的信息交给邮递员，帮你把信息整理成信封。
        Map envelope = MailConfig.config(from, to);
        //拿到信封，发送出去
        for (int i = 0; i < 5; i++) {
            MailConfig.send(envelope);

        }


    }
}
