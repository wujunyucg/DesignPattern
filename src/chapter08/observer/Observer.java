package chapter08.observer;

public interface Observer {
    //让被观察者通知观察者状态已经改变
    void update(NumberGenerator generator);
}
