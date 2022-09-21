package org.example;

public class MessageTask implements Runnable{
    private int times;
    private int millis;
    private String message;

    public MessageTask(int times, int millis, String message) {
        this.times = times;
        this.millis = millis;
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i<times;i++){
            System.out.println(message);
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
