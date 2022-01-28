package com.thread.Incrementator;

import static com.utils.ThreadUtils.sleep;

public class Main {

    public static int mValue = 0;

    static Incremenator mInc;

    public static void main(String[] args) {
        mInc = new Incremenator();

        System.out.print("Значения = ");

        mInc.start();

        for (int i = 1; i <= 3; i++) {

            sleep(i * 2 * 1000);

            mInc.changeAction();
        }

        mInc.interrupt();
    }
}


