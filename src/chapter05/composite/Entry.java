package chapter05.composite;

//角色中的 Component，表示目录条目的抽象类
public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    //显示目录条目一览
    public void printList() {
        printList("");
    }

    //为一览加上前缀
    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
