package chapter08.memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);    //掷筛子的次数
            System.out.println(" 当前状态：" + gamer);
            gamer.bet();    //进行游戏
            System.out.println("所持金钱为：" + gamer.getMoney() + " 元。");
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    (所持金额增加了，因此保存当前的状态。)");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    所持金钱减少了，回复至之前的状态");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println();
        }
    }
}
