package com.cpg.lab8.exercise2;

import java.util.Date;

class Timer implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println(new Date());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}	