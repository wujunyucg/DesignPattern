package chapter09.flyweight;

import java.util.HashMap;
import java.util.Map;

// 生成 BigChar 实例的工厂，实现了共享实例的功能。
public class BigCharFactory {
    // 管理已经生成的 BigChar 的实例
    private Map<String, BigChar> pool = new HashMap<>();
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {

    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bigChar = pool.get(charName);
        if (bigChar == null) {
            bigChar = new BigChar(charName);
            pool.put("" + charName, bigChar);
        }
        return bigChar;
    }
}
