package chapter03.abstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

//抽象地表示 HTML 页面的类，可以看作是零件组成的产品
public abstract class Page {
    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String fileNmae = "file/abstractFactory/" + title + ",html";
            Writer writer = new FileWriter(fileNmae);
            writer.write(this.makeHtml());
            writer.close();
            System.out.println(fileNmae + "编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHtml();
}
