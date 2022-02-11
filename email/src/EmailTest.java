import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class EmailTest {
     //程序入口
    public static void main(String[] args) throws MessagingException {

       //配置发送者信息
        Properties from = new Properties(){{
            //配置邮箱服务器地址
            setProperty("foxmail.host","smtp.qq.com");
            //配置邮件传输协议
            setProperty("foxmail.transport.protocol","smtp");
            //配置QQ邮箱
            setProperty("foxmail.host.mail","1853737225@qq.com");
            //配置授权码(相当于，密码)
            setProperty("foxmail.smtp.pwd","csdqqmyqqdzbcada");
        }};
         //配置接收方
        Properties to = new Properties(){{
            //接收者邮箱信息
            setProperty("mail_target","837783587@qq.com");
            //配置标题
            setProperty("mail_title","ok");
            //配置内容
            setProperty("mail_content","hello~~");


        }};
        //把发送者跟接收者的信息整合一下（相当于把各类信息填入到信封上的收件人，寄件人，然后把信纸塞进信封）
        Map config = MailConfig.config(from, to);
        //把整合后得到的信息交给服务器发送(服务器相当于邮递员)
        MailConfig.send(config);
    }
}
