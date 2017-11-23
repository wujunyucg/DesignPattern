package chapter01.adapter.objectAdapter;


public class PrintBanner extends Print{

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeek() {
        banner.showWithPattern();
    }

    @Override
    public void printStrong() {
        banner.showWithStar();
    }
}
