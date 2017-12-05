package chapter03.abstractFactory.listFactory;

import chapter03.abstractFactory.factory.Link;

public class ListLink extends Link{
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "    <li><a href=\"" + url + "\">" + caption + "</a><li>\n";
    }
}
