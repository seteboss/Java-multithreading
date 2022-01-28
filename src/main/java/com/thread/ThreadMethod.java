package com.thread;

import static com.utils.ThreadUtils.sleep;

public class ThreadMethod {


    public static void main(String[] args) throws InterruptedException {

        Thread runnable = new Thread(new RunnableImpl());
        ExtendsThread extendsThread = new ExtendsThread();

        runnable.start();

        sleep(1000);

        extendsThread.start();

    }





}
