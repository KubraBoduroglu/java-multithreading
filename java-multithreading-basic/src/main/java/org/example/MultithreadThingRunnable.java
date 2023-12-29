package org.example;

public class MultithreadThingRunnable  implements Runnable {
    /* PHASE 3: */
    private final int threadNum;
    public MultithreadThingRunnable(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNum);
            if (threadNum==3){
                throw new RuntimeException();
                // This doesn't stop other threads.
            }
            try {
                //sleep: wait 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
