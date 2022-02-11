import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class MailTest {

    //程序的入口
    public static void main(String[] args) throws MessagingException {
        //需要一个记事本填写登录相关信息
        Properties from = new Properties(){{
            //到了QQ邮箱网站
            setProperty("foxmail.host","smtp.qq.com");
            //填写账号
            setProperty("foxmail.host.mail","1853737225@qq.com");
            //填写密码 ===> 授权码
            setProperty("foxmail.smtp.pwd","kpmliqsslfypbifc");
            //填写传输协议 SMTP
            setProperty("foxmail.transport.protocol","smtp");
        }};


        //需要一个记事本填写登录相关信息
        Properties to = new Properties(){{

            //设置接收者的信息
            setProperty("mail_target","837783587@qq.com");
            //设置标题
            setProperty("mail_title","欢迎欢迎");
            //设置接收者的信息
            setProperty("mail_content","欢迎来到乐学优课");

        }};
             //整合接收者和发送者的信息 相当于把信塞进信封
        Map envelope = MailConfig.config(from, to);
          //把信封交给邮递员发送
        MailConfig.send(envelope);



    }
}
