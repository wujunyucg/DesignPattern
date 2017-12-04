package chapter03.abstractFactory.factory;

//代表项目，是 Link 和 Tray 的父类
public abstract class Item {
    //项目的标题
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHtml();
}

