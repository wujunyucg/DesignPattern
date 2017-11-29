package chapter03.builder;

public class TextBilder extends Builder {
    private StringBuffer buffer = new StringBuffer();
    @Override
    void makeTitle(String title) {
        buffer.append("===============================\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    void makeString(String str) {
        buffer.append('◼' + str + "\n");
        buffer.append("\n");
    }

    @Override
    void makeItems(String[] items) {
        for(int i = 0; i < items.length; i++) {
            buffer.append("    ." + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    void close() {
        buffer.append("===============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
