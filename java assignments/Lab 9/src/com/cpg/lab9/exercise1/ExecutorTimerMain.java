package com.cpg.lab9.exercise1;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ExecutorTimer extends Thread {
    public void run() {
        System.out.println(new Date());
    }
}

public class ExecutorTimerMain {
    public static void main(String args[]) {
        ScheduledExecutorService eservice = Executors.newScheduledThreadPool(10);
        eservice.scheduleWithFixedDelay(new ExecutorTimer(), 0, 10, TimeUnit.SECONDS);
    }
}
