import br.com.kpires.carFactory.Car;
import br.com.kpires.carFactory.Director;
import br.com.kpires.carFactory.SelectCar;

public class Demo{

    public static void main(String[] args) {

        SelectCar selectCar = new SelectCar();
        selectCar.selectTypeCar();

        Director director = new Director();
        director.setCarFactory(selectCar.carType);
        Car car1 = director.createCar();

        System.out.println(car1);
    }
}
