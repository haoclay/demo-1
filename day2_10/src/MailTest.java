import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class MailTest {
    //程序入口
    public static void main(String[] args) throws MessagingException {
        // 登陆者的信息柜
        Properties from = new Properties();
        //设置QQ邮箱服务器网址
        from.setProperty("foxmail.host","smtp.qq.com");
        //设置邮箱账号
        from.setProperty("foxmail.host.mail","1853737225@qq.com");
        //设置密码  ->授权码  yytowaqbltohbiga
        from.setProperty("foxmail.smtp.pwd","yytowaqbltohbiga");
        //配置传输 协议
        from.setProperty("foxmail.transport.protocol","smtp");

        // 接收者的信息柜
        Properties to = new Properties();
        // 配置 接受者账号
        to.setProperty("mail_target","1369577345@qq.com");
        // 配置主题
        to.setProperty("mail_title","欢迎大家");
        // 配置正文
        to.setProperty("mail_content","欢迎大家来到乐学优课");

        //把两个储物柜里的信息整合成一个信封
        Map envelope = MailConfig.config(from, to);

        //把信封  envelope 交给邮递员发送
        MailConfig.send(envelope);


    }
}
