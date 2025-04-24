package org.studyeasy;


class Balance implements Runnable{
    int amount , balance ;
    Balance(int balance , int amount){
        this.balance = balance;
        this.amount = amount;
    }
    public synchronized void run(){
        String name = Thread.currentThread().getName();
        if(balance >= amount){

            System.out.println("Transaction Approved for : " +name+" " + balance);

            balance -= amount;
            System.out.println("Remainning balance : " + name+" " +balance);
        }else{
            System.out.println("Insufficient Funds : " + " " + name);
        }
    }
}

public class amount {
    public static void main(String[] args) {
        Balance r = new Balance(10000, 4000);

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.setName("Vishal");
        t2.setName("Anu");
        t3.setName("Deepak");
        t1.start();
        t2.start();
        t3.start();



    }
}
