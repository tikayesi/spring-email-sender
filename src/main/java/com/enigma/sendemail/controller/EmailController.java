package com.enigma.sendemail.controller;

import com.enigma.sendemail.bean.Mail;
import com.enigma.sendemail.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    MailService mailService;

    @PostMapping("/")
    public void send(){
        Mail mail = new Mail();
        mail.setMailFrom("tika@gmail.com");
        mail.setMailTo("tika@gmail.com");
        mail.setMailSubject("Spring boot - Email example");
        mail.setMailContent("learn how to send email");
        mailService.sendMail(mail);
    }

}
