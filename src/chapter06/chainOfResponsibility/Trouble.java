package chapter06.chainOfResponsibility;

//问题类，具有问题编号，编号是职责链处理的依据
public class Trouble {
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble " + number + "]";
    }
}
