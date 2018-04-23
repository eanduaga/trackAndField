package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eider
 */

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailTLS
{
    public static void main(String[] args)
    {
        final String username = "dm3-1-03.17@uni.eus";
        final String password = "hdfhafga";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
        
        try
        {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("dm3-1-03.17@uni.eus"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("trackandfieldcompetitions@gmail.com"));
            message.setSubject("New User");
            message.setText("Testing Subject,"
                    + "\n\n Do not respond to this email.");

            Transport.send(message);
        }
        catch (MessagingException e)
        {
                throw new RuntimeException(e);
        }
    }
}
