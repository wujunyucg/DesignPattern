package chapter04.strategy;

public interface Strategy {
    Hand nextHand();

    //根据上一局输赢进行学习
    void study(boolean win);
}
