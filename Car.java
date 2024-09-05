import java.util.*;
public class Car implements Comparator <Car>{
        private String registrationNumber;
        private String brand;
        private String model;

        public Car(String registrationNumber, String brand, String model) {
            this.registrationNumber = registrationNumber;
            this.brand = brand;
            this.model = model;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "registrationNumber='" + registrationNumber + '\'' +
                    ", brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    '}';
        }
    public int compare(Car o1, Car o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
    public static Comparator<Car> BrandComparator = new Comparator <Car>(){
        public int compare(Car o1, Car o2) {
            return o1.getBrand().compareTo(o2.getBrand());
        }
    };
    public static Comparator<Car> RegistNumberComparator = new Comparator<Car>() {
        public int compare(Car o1, Car o2) {
            return o1.getRegistrationNumber().compareTo(o2.getRegistrationNumber());
        }

    };
}

