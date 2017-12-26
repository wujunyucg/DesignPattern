package chapter06.visitor;

//表示访问者的抽象类，依赖于访问的数据结构
public abstract class Visitor {
    //根据不同的参数调用不同的访问方法
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
