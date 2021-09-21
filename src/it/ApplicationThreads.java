package it;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ApplicationThreads {
    public static void main(String[] args) throws InterruptedException {
        Threads myThread = new Threads();
//        myThread.start();
//        myThread.join();
        RunnableThread myRunnable = new RunnableThread();
//        myRunnable.run();
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(myThread);
        es.execute(myRunnable);
        es.shutdown();

    }
}
