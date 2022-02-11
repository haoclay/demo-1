import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class MailTest {

    //程序的入口
    public static void main(String[] args) throws MessagingException {
        //创建一个登录者的储物柜
        Properties from = new Properties();
        //设置QQ邮箱的 服务器
        from.setProperty("foxmail.host","smtp.qq.com");
        //设置一个QQ邮箱账号
        from.setProperty("foxmail.host.mail","1853737225@qq.com");
        //设置密码 -> 授权码
        from.setProperty("foxmail.smtp.pwd","iicdbtrojbjobgic");
        //手动配置传输协议
        from.setProperty("foxmail.transport.protocol","smtp");

       //创建一个接收者的信息
        Properties to = new Properties();
        //发给谁？
        to.setProperty("mail_target","2049806236@qq.com");
        //标题是什么?
        to.setProperty("mail_title","欢迎你呀");
        //正文是什么?
        to.setProperty("mail_content","欢迎你来到乐学优课...");

        //把发送者和接收者的储物柜交给邮递员 ->产生一个信封
        Map envelope = MailConfig.config(from, to);

        //把信封交给邮递员发送
        for (int i = 0; i < 5; i++) {

            MailConfig.send(envelope);
        }


    }
}
