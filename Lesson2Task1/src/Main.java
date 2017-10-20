import com.mypackage.Car;
import com.mypackage.Boat;
import com.mypackage.SolarCar;
public class Main {
    public static void main(String[] args) {
        System.out.println("It is a car:");
        Car car = new Car(300);
        car.turn();
        car.accelerate();
        car.getDetails();
        System.out.println("It is a boat");
        Boat boat = new Boat(200);
        boat.turn();
        boat.accelerate();
        boat.getDetails();
        System.out.println("It is a solar car");
        SolarCar solarCar = new SolarCar();
        solarCar.turn();
        solarCar.accelerate();
        solarCar.breaking();
        solarCar.getDetails();
    }
}
