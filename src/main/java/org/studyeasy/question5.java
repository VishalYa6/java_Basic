//package org.studyeasy;
//
//class Mythread2 implements Runnable{
//    Thread t , t1 ;
//    Mythread2(){
//        t = new Thread(this , "batman");
//        t1 = new Thread(this , "superwomen");
//        t.start();
//        t1.start();
//    }
//    public void run(){
//        System.out.println("Child thread");
//        System.out.println("thread details" + Thread.currentThread());
//    }
//}
//class question5 {
//    public static void main(String[] args) {
//        new Mythread2();
//        System.out.println("Main Threadd Started");
//        System.out.println("Thread details" + Thread.currentThread());
//        try {
//            Thread.sleep(5000);
//        }catch (Exception e){
//            System.out.println("Main thread is working");
//        }
//    }
//}