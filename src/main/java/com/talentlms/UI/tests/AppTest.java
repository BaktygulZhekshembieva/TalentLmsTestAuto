package com.talentlms.UI.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.*;
import com.talentlms.UI.driverFactory.Driver;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;

public class AppTest {

  @Test
  public void testExample() throws IOException, MailosaurException {
    // Available in the API tab of a server
    String apiKey = "w5HuHbfm1ywbN9iS";
    String serverId = "o17trwpv";
    String serverDomain = "weak-sometime@o17trwpv.mailosaur.net";

    MailosaurClient mailosaur = new MailosaurClient(apiKey);

    MessageSearchParams params = new MessageSearchParams();
    params.withServer(serverId);

    SearchCriteria criteria = new SearchCriteria();
    criteria.withSentTo("anything@o17trwpv.mailosaur.net");
    criteria.withSubject("Hello World");
    criteria.withSentFrom("baktygul.jekshembieva.ch@gmail.com");

    Message message = mailosaur.messages().get(params, criteria);

    assertNotNull(message);
    assertEquals("Hello World", message.subject());

    System.out.println("The subject of the email is: " + message.subject());
  }

  @Test
  public void testExample1() throws IOException, MailosaurException {
    // Available in the API tab of a server
    String apiKey = "w5HuHbfm1ywbN9iS";
    String serverId = "o17trwpv";
    String serverDomain = "weak-sometime@o17trwpv.mailosaur.net";

    MailosaurClient mailosaur = new MailosaurClient(apiKey);

    MessageSearchParams params = new MessageSearchParams();
    params.withServer(serverId);

    SearchCriteria criteria = new SearchCriteria();
    criteria.withSentTo("work-door@o17trwpv.mailosaur.net");
    criteria.withSubject("IMoving link");
    criteria.withSentFrom("baktygul.jekshembieva.ch@gmail.com");

    Message message = mailosaur.messages().get(params, criteria);

    assertNotNull(message);
    assertEquals("IMoving link", message.subject());

    System.out.println("The subject of the email is: " + message.subject());
    System.out.println("This is link: " + message.html().links().get(0).href());
    URL url = new URL(message.html().links().get(0).href());
    Driver.getDriver().get(url.toString());
  }
}