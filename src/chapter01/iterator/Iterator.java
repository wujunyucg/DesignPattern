package chapter01.iterator;

public interface Iterator {
    //判断是否存在下一个元素
    boolean hasNext();
    //返回下一个元素，并且移动迭代器
    Object next();
}
