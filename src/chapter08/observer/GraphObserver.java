package chapter08.observer;

// 将观察到的数值以 ***** 的方式显示出来
public class GraphObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver: ");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++){
            System.out.print("*");
        }
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
