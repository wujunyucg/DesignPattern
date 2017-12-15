package chapter06.chainOfResponsibility;

//解决问题德抽象类
public abstract class Support {
    //实例的名字
    private String name;
    //下一个处理人员
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    public String toString() {
        return "[" + name + "]";
    }

    //解决问题的办法
    protected abstract boolean resolve(Trouble trouble);

    //解决
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by" + this + ".");
    }

    //未解决
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }

}
