package Lesson6;

public class Cat implements Pet{
    @Override
    public boolean run(double metre) {
        if (metre < random(150, 250)) {
            return true;
        } else return false;
    }

    @Override
    public boolean jump(double metre) {
        if (metre < random(1, 2.5)) {
            return true;
        } else return false;
    }

    @Override
    public boolean swim(double metre) {
       return false;
    }
}
