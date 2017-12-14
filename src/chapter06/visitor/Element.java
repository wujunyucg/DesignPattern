package chapter06.visitor;

public interface Element {
    void accept(Visitor visitor);
}
