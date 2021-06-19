package tests;

import org.testng.annotations.Test;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class WorkoutSample
{
    @Test
    public void sendMail()
    {
        try {
            String to="Jayamadhan.Sivanraj@motivano.com";
            String from="Jayamadhan.Sivanraj@motivano.com";

            Properties props = new Properties();
//            props.put("mail.smtp.socketFactory.port", "587");
//            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//            props.put("mail.smtp.socketFactory.fallback", "true");
            props.put("mail.smtp.host", "smtp.office365.com");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.starttls.enable","true");
            props.put("mail.smtp.auth", "true");
           // props.put("mail.smtp.ssl.protocols","TLSv1.2");
            props.put("mail.smtp.ssl.trust", "smtp.office365.com");

            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication("Jayamadhan.Sivanraj@motivano.com","Chennai2402!");
                        }
                    });

//            Session emailSession = Session.getDefaultInstance(props, null);

            String msgBody = "Sending email using JavaMail API...";

            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from, "NoReply"));
            msg.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to, "Mr. Recipient"));
            msg.setSubject("Welcome To Java Mail API");

            //msg.setText(msgBody);

            BodyPart messageBodyPart1 = new MimeBodyPart();
            messageBodyPart1.setText("This is message body");
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();

            String filename = "test-output/index.html";//change accordingly
            DataSource source = new FileDataSource(filename);
            messageBodyPart2.setDataHandler(new DataHandler(source));
            messageBodyPart2.setFileName(filename);


            //5) create Multipart object and add MimeBodyPart objects to this object
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart1);
            multipart.addBodyPart(messageBodyPart2);
            msg.setContent(multipart);
            System.out.println("Sendding mail");
            Transport.send(msg);
            System.out.println("Email sent successfully...");

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());

        }

    }

}

