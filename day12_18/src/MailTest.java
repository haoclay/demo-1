import com.sgq.teach.MailConfig;

import javax.mail.MessagingException;
import java.util.Map;
import java.util.Properties;

public class MailTest {

    public static void main(String[] args) throws MessagingException {
        Properties from = new Properties(){{
            setProperty("foxmail.host","smtp.qq.com");
            setProperty("foxmail.host.mail","1853737225@qq.com");
            setProperty("foxmail.smtp.pwd","uwnohlcgqbqmbieg");
            setProperty("foxmail.transport.protocol","smtp");

        }};

        Properties to = new Properties(){{
            setProperty("mail_target","837783587@qq.com");
            setProperty("mail_title","hello");
            setProperty("mail_content","java...");

        }};

        Map config = MailConfig.config(from, to);
        MailConfig.send(config);

    }
}
