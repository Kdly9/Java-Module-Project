public class Car {
    String name;
    int speed;

    void setCarName(String name) {
        this.name = name;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    String getName() {
        return name;
    }

    double calcKmForDay() {
        return speed * 24;
    }
}