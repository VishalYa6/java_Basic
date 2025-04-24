package org.studyeasy;


class Bus implements Runnable{
    int ava= 1 , pass;
    Bus(int pass){
        this.pass = pass;
    }
    public synchronized void  run(){
        String name = Thread.currentThread().getName();
        if(ava>=pass){
            System.out.println("Booking Confirmed : " + name );
            ava -= pass ;
        }else {
            System.out.println("seats are not available");
        }

    }
}
public class question7 {
    public static void main(String[] args) {
        Bus r = new Bus(1);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.setName("Vishal");
        t2.setName("Radhe");
        t3.setName("Krishna");
        t1.start();
        t2.start();
        t3.start();
    }
}
