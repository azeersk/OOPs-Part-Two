import java.util.Scanner;

interface A{
    void PrintOf(int a,int b);
}

interface B{
    void ReturnOf();
}

class C implements A{
    int a;
    int b;
    public void PrintOf(int a,int b){
        System.out.println(2*a*b);
    }
}

class D implements A,B{
    public void PrintOf(int a, int b){
        int c = (2*a*b + 2*b*a);
        System.out.println(c);
    }

    public void ReturnOf(){
        System.out.println("Return is true Values!" );
    }
}

public class InterfaceMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        C c = new C();
        D d = new D();
        c.PrintOf(a,b);
        d.PrintOf(a,b);
        d.ReturnOf();
    }
}
