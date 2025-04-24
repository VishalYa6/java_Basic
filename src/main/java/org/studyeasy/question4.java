package org.studyeasy;

import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalance extends Exception{
    InsufficientBalance(){
        super(" Insufficient rupees in the bank");
    }
}

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int balance = sc.nextInt();
            int amount = sc.nextInt();
            if(balance <= amount ){
                throw new InsufficientBalance();
            }else{
                balance -= amount ;
                System.out.println("balance: "+balance);
            }

        }catch (InputMismatchException e){
            System.out.println("Enter Intger Value");
        }catch (InsufficientBalance e1){
            System.out.println(e1.getMessage());
        }


    }
}
