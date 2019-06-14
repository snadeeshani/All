package com.virtusa.thread;

public class Printer extends  Thread {


    @Override
    public void run() {
        for (int i=0; i<10; i++)
        {
            System.out.println("This is child  thread"+currentThread().getName()+" "+i);
        }

    }

    @Override
    public  void start() {

        System.out.println("Thread start");
        super.start();
    }
}
