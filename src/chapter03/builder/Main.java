package chapter03.builder;

public class Main {
    public static void main(String[] args) {

        TextBilder textBilder = new TextBilder();
        Director director = new Director(textBilder);
        director.construct();
        String result = textBilder.getResult();
        System.out.println(result);
        HtmlBuilder htmlBuilder = new HtmlBuilder();
        Director director2 = new Director(htmlBuilder);
        director2.construct();
        String fileName = htmlBuilder.getResult();
        System.out.println(fileName + " 文件编写完成。");
    }

}
