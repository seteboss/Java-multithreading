package com.thread.Incrementator;

public class Incremenator extends Thread {

    private volatile boolean mIsIncrement = true;

    public void changeAction()  {  //Меняет действие на противоположное
        mIsIncrement = !mIsIncrement;
    }


    @Override
    public void run() {
        do {
            if (!Thread.interrupted()) {    //Проверка на необходимость завершения
                if (mIsIncrement)
                    Main.mValue++;
                else
                    Main.mValue--;
                System.out.print(Main.mValue + " ");
            } else {
                return;
            }

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
        while (true);
    }
}