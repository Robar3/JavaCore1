package Lesson6;

public class Dog implements Pet{

    @Override
    public boolean run(double metre) {
        if(metre<random(400,600)){
            return true;
        }
        else return false;
    }

    @Override
    public boolean jump(double metre) {
        if (metre < random(0.3, 0.6)) {
            return true;
        } else return false;

    }

    @Override
    public boolean swim(double metre) {
        if (metre < random(8, 15)) {
            return true;
        } else return false;
    }
}
