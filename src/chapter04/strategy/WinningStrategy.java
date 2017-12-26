package chapter04.strategy;


import java.util.Random;

public class WinningStrategy implements Strategy {
    //如果上一局获胜，就和上一局出相同的
    //如果上一局失败，随机出

    //随机值，决定怎么出
    private Random random;
    //上一局的结果
    private boolean won = false;
    //上一局的手势
    private Hand prevHand;

    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
