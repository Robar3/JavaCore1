package Lesson6;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();
        System.out.println(dog.run(400));
        System.out.println(dog.jump(0.2));
        System.out.println(dog.swim(5));
        System.out.println(cat.run(200));
        System.out.println(cat.jump(1.5));
        System.out.println(cat.swim(5));

        Plate plate = new Plate(4);
        List<Cat> cats = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            cats.add(new Cat());

            plate.feed(cats.get(i));
            System.out.println(cats.get(i).isSatiety());
        }
        plate.addWhiskas(4);

    }
}
