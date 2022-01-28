package com.thread;

import com.utils.ThreadUtils;

public class ExtendsThread extends Thread {


    @Override
    public void run() {

        ThreadUtils.sleep(4000);

        interrupt();

        System.out.println(Thread.currentThread().getName() + " ExtendsThread");

    }
}
