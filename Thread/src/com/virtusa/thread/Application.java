package com.virtusa.thread;

public class Application  {

    public static void main(String[] args) {

        Printer p= new Printer();
        p.setDaemon(true);
        p.start();

        for (int i=0; i<=10; i++)
        {
            System.out.println("This is main thread"+i);
        }
        System.out.println("--------------------");
    }
}
