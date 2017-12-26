package chapter03.prototype;

public interface Product extends Cloneable {
    void use(String s);

    //复制实例的方法
    Product createClone();
}
