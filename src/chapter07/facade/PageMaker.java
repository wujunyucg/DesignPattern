package chapter07.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//使用 DataBase 和 HtmlWriter 生成指定用户的页面
public class PageMaker {
    private PageMaker() {

    }

    public static void makeWelcomePage(String mailaddr, String fileName) {
        try {
            Properties mailProp = DataBase.getProperties("maildata");
            String userName = mailProp.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("Welcome to " + userName + "'s page!");
            writer.paragraph(userName + "欢迎来到" + userName + "的主页");
            writer.paragraph("等着你的邮件喔！");
            writer.mailto(mailaddr, userName);
            writer.close();
            System.out.println(fileName + " is created for " + mailaddr + " (" + userName + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
