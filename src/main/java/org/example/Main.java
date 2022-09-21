package org.example;

public class Main {
    public static void main(String[] args) {
        Thread messageThread = new Thread(new MessageTask(50,20,"¡¡Vamos Rafa!!"));
        Thread goodbyeThread = new Thread(new MessageTask(50,10,"goodbye"));
        messageThread.start();
        goodbyeThread.start();
    }
}