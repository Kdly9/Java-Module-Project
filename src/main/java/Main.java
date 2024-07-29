import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Race race = new Race();
        Scanner scan = new Scanner(System.in);
        while (race.getCarArraySize() < 3) {
            Car car = new Car();
            int number = race.getCarArraySize() + 1;
            System.out.println("Введите название машины №" + number);
            car.setCarName(scan.next());
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.println("Введите скорость машины №" + number);
                    int speed = scan.nextInt();
                    if (speed > 0 && speed <= 250) {
                        validInput = true;
                        car.setSpeed(speed);
                    } else {
                        throw new Exception();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: это не число");
                    scan.next();
                } catch (Exception e) {
                    System.out.println("Ошибка: введите корректное число от 0 до 250");
                }
            }
            race.addCar(car);
        }
        Car leader = race.findLeader();
        System.out.println("Лидер гонки: " + leader.getName());
    }
}
