import java.util.Scanner;

abstract class VehicleOne{
    public void CarNormalDetails(String Company){
        System.out.println("Car Company: "+ Company);
        System.out.println("Car Color: Red.");
        System.out.println("Car Cost: 3.5M.");
    }
    abstract public void CarDetails();
}

class Car extends VehicleOne{
    String company;
    @Override
    public void CarDetails(){
        super.CarNormalDetails(company);
        System.out.println("Car Minimum Speed: 10kh");
        System.out.println("Car Maximum Speed: 330kh");
        System.out.println("Car Contains Only 2 Seats!");
    }
}

public class AbstractMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Company = input.nextLine();
        Car car = new Car();
        car.company = Company;
//        car.CarNormalDetails(Company);
        car.CarDetails();
    }
}
