package chapter07.mediator;

public interface Colleague {
    //让组员知道仲裁者
    void SetMediator(Mediator mediator);
    //告知组员仲裁者下达的命令，在这个例子中就是启用或不启用
    void setColleagueEnabled(boolean enabled);
}
