package chapter09.flyweight;

// 由 BigChar 组成的字符串
public class BigString {
    // 大型字符的数组
    private BigChar[] bigChars;

    public BigString(String string) {
        this.bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
