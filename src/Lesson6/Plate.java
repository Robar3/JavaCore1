package Lesson6;

public class Plate {
    private int whiskas;

    public Plate(int whiskas) {
        this.whiskas = whiskas;
    }

    public boolean feed(Cat cat) {
        if (!cat.isSatiety() && whiskas > 0) {
            cat.setSatiety(true);
            whiskas--;
        }
        return cat.isSatiety();
    }

    public void addWhiskas(int whiskas){
        this.whiskas +=whiskas;
    }
}
