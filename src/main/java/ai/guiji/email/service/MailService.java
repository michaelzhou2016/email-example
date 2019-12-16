package ai.guiji.email.service;

import javax.mail.MessagingException;

public interface MailService {

    void sendMailByRemind(String tel);

    void sendSimpleMail(String from, String[] to, String title, String content);

    void sendImageMail(String to, String subject, String content, String imgPath, String imgId) throws MessagingException;

    void sendHtmlWithImageMail(String from, String[] to, String subject, String content, String url) throws MessagingException;

    void sendHtmlMail(String from, String[] to, String subject, String content) throws MessagingException;

    void sendTemplateMail();

    void sendPictureTemplateMail();
}
