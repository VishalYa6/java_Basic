package org.studyeasy;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the units");
        int units = sc.nextInt();
        double billAmount = 0.0 ;
        if (units <= 100){
            billAmount = units*1.50;
        } else if (units <= 300) {
            billAmount = (100*1.50)+((units -100) * 2.50);
            System.out.println();
        }else{
            billAmount = (100 *1.50)+(200 *2.50)+((units -300)*4.00);
        }
        System.out.println("Electricity Bill " +billAmount);
    }
}
