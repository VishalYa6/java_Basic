package org.studyeasy;
import java.io.IOException;
import java.util.Scanner;

class Passwordcheck{
    static void check(String s1 , String s2) throws Exception{
        if(s1.equals(s2)){
            System.out.println("password being matched");
        }else{
           throw new IOException("Not matching ");
        }
    }
}
public class question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pwd1 = sc.nextLine();
        String pwd2 = sc.nextLine();
        try{
            Passwordcheck.check(pwd1 , pwd2);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }catch(Exception e2){
            System.out.println("other errors");
        }
    }


}