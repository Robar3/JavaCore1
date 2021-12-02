package Lesson6;

import java.util.Random;

public interface Pet {
    default double random(double min, double max){
        Random r = new Random();
        return min + (max - min) * r.nextDouble();
    };
    boolean run(double metre);
    boolean  jump(double metre);
    boolean  swim(double metre);
}
