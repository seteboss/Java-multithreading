package com;

public class PingPong {

    public PingPong(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    private String lastMessage;

    public synchronized void action(String message) {
        while (true) {
            if (message.equals(lastMessage)) {
                wait(this);
            } else {
                System.out.println(message);
                lastMessage = message;
                sleep();
                notifyAll();
            }
            if (Thread.interrupted()) {
                return;
            }
        }
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void wait(Object o) {
        try {
            o.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        PingPong pingPong = new PingPong("pong");

        Thread thread1 = new Thread(() -> pingPong.action("pong"));
        Thread thread2 = new Thread(() -> pingPong.action("ping"));

        thread1.start();
        thread2.start();
    }

}
