/*import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Autopark {
    ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCarByNumber(String registrationNumber) {
        ListIterator iterator = cars.listIterator();
        while (iterator.hasNext()) {

            if (String.toString(iterator.next()).getRegistrationNumber().equals(registrationNumber)) {
                iterator.remove();
                System.out.println("Автомобиль с номером " + registrationNumber + " удален.");
                return;
            }
        }
        System.out.println("Автомобиль с номером " + registrationNumber + " не найден.");
    }

    public void findCarByBrand(String brand) {
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                System.out.println("Найден автомобиль: " + car);
                return;
            }
        }
        System.out.println("Автомобили марки " + brand + " не найдены.");
    }

    public void sortCarsByNumber() {
        cars.sort(Car.RegistNumberComparator);
    }
    public void displayAllCars() {
        System.out.println("Автомобили в автопарке:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
*/
