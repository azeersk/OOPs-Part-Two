import java.util.Scanner;

class Animal{
    String AnimalBreed;
    int NumberOfAnimals;

    public void Sounds(){
        System.out.println("Animal Sounds!");
    }
}

class Dog extends Animal{
    @Override
    public void Sounds(){
        super.Sounds();
    }

    public void DogW(){
        String AB = super.AnimalBreed;
        int NOA = super.NumberOfAnimals;
        System.out.println("Animal type: "+ AB);
        System.out.println("Number Of "+AB+"s: "+ NOA);
        System.out.println(AB +" Barks!");
    }
}

public class OverridingMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String ab = input.nextLine();
        int noa = input.nextInt();
        Dog obj = new Dog();
        obj.AnimalBreed = ab;
        obj.NumberOfAnimals = noa;
        obj.Sounds();
        obj.DogW();
    }
}
