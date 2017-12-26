package chapter09.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 表示大型字符
public class BigChar {
    private char charName;
    //大型字符对应的字符串，由 # . \n 组成
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try {
            BufferedReader reader = new BufferedReader(
                    //从文件中将大型字符的字符串读出
                    new FileReader("file/flyweight/big" + charName + ".txt")
            );
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontData = buf.toString();
        } catch (IOException e) {
            this.fontData = charName + "?";
        }
    }

    public void print() {
        System.out.println(fontData);
    }
}
