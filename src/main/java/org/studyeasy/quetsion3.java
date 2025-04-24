package org.studyeasy;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class myage extends Exception{
    myage(){
        super("You are under 18");
    }
}
public class quetsion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int age = sc.nextInt();
            if(age< 18){
                throw new myage();
            }else{
                System.out.println("eligible for driving");
            }
        }catch(InputMismatchException e){
            System.out.println("Enter integer Value");
        }catch(myage e1){
            System.out.println(e1.getMessage());
        }

    }

}
