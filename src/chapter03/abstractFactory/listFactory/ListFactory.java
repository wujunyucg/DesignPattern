package chapter03.abstractFactory.listFactory;

import chapter03.abstractFactory.factory.Factory;
import chapter03.abstractFactory.factory.Link;
import chapter03.abstractFactory.factory.Page;
import chapter03.abstractFactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
