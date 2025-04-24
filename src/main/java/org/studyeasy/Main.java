
import java.util.InputMismatchException;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = (a/b);
            System.out.println("Division : " + c);
        }catch (InputMismatchException e){
            System.out.println("ENter intetger value");
        }catch (ArithmeticException e1){
            System.out.println("Not enter the value 0");
        }
    }
}