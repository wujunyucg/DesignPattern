package chapter03.abstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

//Tray 类表示一个含有多个 Link 类和 Tray 类的容器。
public abstract class Tray extends Item {
    protected List<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
