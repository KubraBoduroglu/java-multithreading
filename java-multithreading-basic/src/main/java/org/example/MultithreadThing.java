package org.example;

public class MultithreadThing  extends Thread {
    /*******************************************************/
    /* PHASE 1 and 2: */
//    @Override
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//            //sleep: wait 1 second
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }

    /*******************************************************/
    /* PHASE 3: */
    private final int threadNum;
    public MultithreadThing(int threadNum) {
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
