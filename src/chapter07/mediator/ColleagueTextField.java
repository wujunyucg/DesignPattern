package chapter07.mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

// 登录窗口的文本框
public class ColleagueTextField extends TextField implements TextListener, Colleague {

    private Mediator mediator;

    public ColleagueTextField(String text, int columns) throws HeadlessException {
        super(text, columns);
    }

    @Override
    public void SetMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.WHITE : Color.lightGray);
    }

    // 当文字发生变化是通知 Meditor
    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
