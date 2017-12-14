package chapter06.visitor;

import chapter05.composite.FileTreatmentException;

//相当于 Composite 模式的父类，在 Visitor 模式中使用并不是必须的
//真正作为被访问者的是它的子类
public abstract class Entry implements Element {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
