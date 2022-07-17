package Model;

public class Number {
    int num;
    boolean isCheck;

    public Number() {
    }

    public Number(int num, boolean isCheck) {
        this.num = num;
        this.isCheck = isCheck;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }
}
