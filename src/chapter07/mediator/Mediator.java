package chapter07.mediator;

public interface Mediator {
    // 生成组员API
    void createColleague();

    //被各个 Colleague 使用，向仲裁者报告
    void colleagueChanged();
}
