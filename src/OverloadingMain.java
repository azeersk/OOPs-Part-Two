import java.util.Scanner;

class Vehicle{
    public void Car(String name, String color){
        System.out.println("Car Name: "+ name);
        System.out.println("Car Color: "+ color);
    }

    public void Car(){
        System.out.println("Car is Started!");
    }

    public void Car(int minSpeed, int maxSpeed){
        System.out.println("Car Minimum Speed is: "+ minSpeed);
        System.out.println("Car Maximum Speed is: "+ maxSpeed);
    }
}

public class OverloadingMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String color = input.nextLine();
        int minSpeed = input.nextInt();
        int maxSpeed = input.nextInt();
        Vehicle VH = new Vehicle();
        VH.Car(name,color);
        VH.Car(minSpeed,maxSpeed);
        VH.Car();
    }
}
