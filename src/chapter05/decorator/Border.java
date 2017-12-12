package chapter05.decorator;

//装饰边框的抽象类，装饰边框和被装饰物具有相同的方法
public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
