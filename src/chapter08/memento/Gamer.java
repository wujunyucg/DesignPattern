package chapter08.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// 表示游戏主人公
public class Gamer {
    private static String[] fruitsName = {
            "苹果", "葡萄", "香蕉", "橘子",
    };
    private int money; //所持金钱
    private List<String> fruits = new ArrayList<>();    //所获得的水果
    private Random random = new Random();   //随机数生成器

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    // 掷筛子进行游戏
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) { //结果为一，增加金钱
            money += 100;
            System.out.println("金钱增加了");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("金钱减半");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得水果（" + f + "）");
        } else {
            System.out.println("什么都没有发生");
        }

    }

    // 拍摄快照
    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            String f = it.next();
            if (f.startsWith("好吃的")) {
                m.addFruits(f);
            }
        }
        return m;
    }

    // 撤销
    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.fruits;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                ", random=" + random +
                '}';
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }
}
