package chapter05.composite;

//防止对文件进行 add操作
public class FileTreatmentException extends RuntimeException{
    public FileTreatmentException() {
    }
    public FileTreatmentException(String msg) {
        super(msg);
    }
}
