package chapter01.adapter.classAdapter;

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }
    public void showWithPattern() {
        System.out.println("(" + string + ")");
    }
}
