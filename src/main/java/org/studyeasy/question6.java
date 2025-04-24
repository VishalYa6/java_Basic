package org.studyeasy;

import javax.sound.midi.Soundbank;

class Numbers implements Runnable{
    Numbers(){
        Thread t ,t1 ;
        t = new Thread(this ,"First" );
        t1 = new Thread(this , "Second");
        t.start();
        t1.start();
    }
    public void run(){
        try{
            for(int i= 1 ; i <= 6 ; i++){
                System.out.println("The child : "+i);
                Thread.sleep(5000);
            }
        }catch (InterruptedException e){
            System.out.println("Error ocurred");
        }
    }


}
public class question6 {
    public static void main(String[] args) {
        new Numbers();
        System.out.println("Main Thread Started");
        System.out.println("Thread Details: " +Thread.currentThread());
        try{
            for(int i= 1 ; i < 8 ; i++){
                System.out.println("the main :" + i);
                Thread.sleep(10000);
            }
        }catch (InterruptedException e){
            System.out.println("Error occurred");
        }
    }
}
