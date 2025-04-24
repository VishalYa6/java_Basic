package org.studyeasy;

import java.util.Scanner;

class oddThread implements Runnable{

    int limit;
    oddThread(int limit){
        this.limit = limit;
    }
    public void run(){

            for(int i = 1; i <= limit ; i+=2){
                System.out.println("oddThread : " +i);
            }
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}
class evenThread implements Runnable{

    int limit;
    evenThread(int limit){
        this.limit = limit;
    }
    public void run(){
        for(int i =2 ; i<= limit ; i+=2){
            System.out.println("evenThread: "+ i);
        }
        try{
            Thread.sleep(15000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
public class oddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int limit = sc.nextInt();
        Thread t = new Thread(new evenThread(limit));
        Thread t1 = new Thread(new oddThread(limit));
        t.start();
        t1.start();



        System.out.println("Main thread finished");
    }
}
