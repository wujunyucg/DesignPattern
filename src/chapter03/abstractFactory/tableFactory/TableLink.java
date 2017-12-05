package chapter03.abstractFactory.tableFactory;

import chapter03.abstractFactory.factory.Link;

public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
