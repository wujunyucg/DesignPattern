package chapter03.abstractFactory.factory;

//表示 HYML 超链接的类
public abstract class Link extends Item{

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
