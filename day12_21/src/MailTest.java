import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class MailTest {

    //程序的入口
    public static void main(String[] args) throws MessagingException {
        //配置发送放的信息
        Properties from = new Properties(){{
            //登录到QQ邮箱服务器，配置服务地址
            setProperty("foxmail.host","smtp.qq.com");
            //配置QQ邮箱账号
            setProperty("foxmail.host.mail","837783587@qq.com");
            //配置QQ邮箱密码==>授权码
            setProperty("foxmail.smtp.pwd","rztxuaoydacnbfih");
            //配置传输协议smtp
            setProperty("foxmail.transport.potocol","smtp");
        }};
         //配置接收方的信息
        Properties to = new Properties(){{
            //配置接受方邮箱
            setProperty("mail_target","1853737225@qq.com");
            //配置邮件标题
            setProperty("mail_title","helloooo");
            //配置邮件的主体内容
            setProperty("mail_content","哈哈，学习java真快乐");
        }};
         //相当于把信件塞进信封
        Map config = MailConfig.config(from, to);
        //把信封交给邮递员即可
        MailConfig.send(config);
    }
}
