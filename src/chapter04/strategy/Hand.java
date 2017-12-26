package chapter04.strategy;

public class Hand {
    public static final int HANDVALUE_GUU = 0;//代表石头
    public static final int HANDVALUE_CHO = 1;//代表剪刀
    public static final int HANDVALUE_PAA = 2;//代表步

    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };

    private static final String[] name = {
            "石头", "剪刀", "布"
    };
    private int handValue;//猜拳中出的值

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    //判断是否强于对方
    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    //判断是否弱于对方
    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name[handValue];
    }
}
