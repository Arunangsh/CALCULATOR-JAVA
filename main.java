import java.util.Scanner;

public class Main {
    public void add(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = in.nextInt();
        System.out.print("Enter another number: ");
        int y = in.nextInt();
        int r_a = (x+y);
        System.out.println("The result is: "+r_a);
    }
    public void sub(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = in.nextInt();
        System.out.print("Enter another number: ");
        int y = in.nextInt();
        int r_s = (x-y);
        System.out.println("The result is: "+r_s);
    }
    public void mul(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = in.nextInt();
        System.out.print("Enter another number: ");
        int y = in.nextInt();
        int r_mul = (x*y);
        System.out.println("The result is: "+r_mul);
    }
    public void div(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = in.nextInt();
        System.out.print("Enter another number: ");
        int y = in.nextInt();
        int r_di = (x/y);
        if (y==0) {
            System.out.println("Invalid!");
        }
        else {
            System.out.println("The result is: "+r_di);
        }
    }
    public void mod(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = in.nextInt();
        System.out.print("Enter another number: ");
        int y = in.nextInt();
        int r_mo = (x%y);
        if (y==0) {
            System.out.println("Invalid!");
        }
        else {
            System.out.println("The result is: "+r_mo);
        }
    }
    public void powe(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double x = in.nextDouble();
        System.out.print("Enter another number: ");
        double y = in.nextDouble();
        double r_po = Math.pow(x, y);
        System.out.print("The result is: "+r_po);

    }

    public static void main(String[] args) {
        System.out.println("**********************CALCULATOR 2.0****************************");
        System.out.println("**************************ARUNANGSHU****************************");
        Main c = new Main();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter what to do: ");
        String cho = in.next();
        if (cho.equals("+")){
            c.add();
        } else if (cho.equals("-")) {
            c.sub();
        } else if (cho.equals("x")) {
            c.mul();
        } else if (cho.equals("/")) {
            c.div();
        } else if (cho.equals("%")) {
            c.mod();
        } else if (cho.equals("power")) {
            c.powe();
        }
        else {
            System.out.println("Invalid Input!");
        }


    }
}
