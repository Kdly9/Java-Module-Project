import java.util.ArrayList;

public class Race {
    ArrayList<Car> cars = new ArrayList<>();
    Car leader = new Car();

    void addCar(Car car) {
        cars.add(car);
    }

    Car findLeader() {
        for (Car car : cars) {
            if (car.calcKmForDay() > leader.calcKmForDay()) {
                leader = car;
            }
        }
        return leader;
    }

    int getCarArraySize() {
        return cars.size();
    }

}
