package com.thread;

import static com.utils.ThreadUtils.sleep;

public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        sleep(1000);
        System.out.println(Thread.currentThread().getName() + " RunnableImpl");
    }
}
