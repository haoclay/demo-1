import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class QQEmailTest {
    //程序入口
    public static void main(String[] args) throws MessagingException {
        //配置发送方的信息
        //Properties(相当于一个信封)
        Properties  from  = new Properties(){{
            //QQ邮箱服务器
            setProperty("foxmail.host","smtp.qq.com");
            //配置传输协议smtp
            setProperty("foxmail.transport.protocol","smtp");
            //配置一个qq邮箱
            setProperty("foxmail.host.mail","1853737225@qq.com");
            //配置授权码（相当于一个密码）
            setProperty("foxmail.smtp.pwd","fvvvvhdttopdbdgc");
        }};
        //配置接收方的信息
        Properties  to  = new Properties(){{
            //接收方的QQ邮箱
            setProperty("mail_target","837783587@qq.com");
            //接收方的主题
            setProperty("mail_title","hello");
            //接收方的内容
            setProperty("mail_content","hello java~~~");
        }};
        //整合发送方和接收方的一个信息，相当于把信纸塞进信封
        Map config = MailConfig.config(from, to);
        //把信封交给邮递员（邮递员其实就是QQ服务器）发送
        MailConfig.send(config);

    }
}
