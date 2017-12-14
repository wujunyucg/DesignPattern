package chapter06.visitor;

// 作为被访问的元素
public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    //告诉 Visitor 正在访问的对象是 File 的实例
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
