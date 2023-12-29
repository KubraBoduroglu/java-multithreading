package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*******************************************************/
        /* PHASE 1: */
//        MultithreadThing myThing = new MultithreadThing();
//        MultithreadThing myThing2 = new MultithreadThing();
        // myThing.run(); -> that would work too, but it wont do that in a seperate thread.
        // myThing.start(); -> kicks of a new thread
//        myThing.start();
//        myThing2.start();
        // This writes -> 00 11 22 33 44

//        myThing.run();
//        myThing2.run();
        //This writes -> 01234 01234
        //Not doing multiple threads, runs myThing first, then runs myThing2.
        /*******************************************************/
        /* PHASE 2: */
//        for (int i = 0; i <= 3; i++) {
//            MultithreadThing myThing = new MultithreadThing();
//            myThing.start();
//        }
        // writes 0000 1111 ..... 4444

        /*******************************************************/
        /* PHASE 3: */
//        for (int i = 0; i <= 3; i++) {
//            MultithreadThing myThing = new MultithreadThing(i);
//            myThing.start();
//        }
//
//        throw new RuntimeException();

        /*******************************************************/
        /* PHASE 4: */
        for (int i = 0; i <= 3; i++) {
            MultithreadThingRunnable myThing = new MultithreadThingRunnable(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
            // Since we cannot use start for myThing anymore cause MultithreadThingRunnable doesnt extend Thread class,
            // we created Thread object.
            //myThread.isAlive();
//            try {
//                myThread.join(); // Waits for this thread to die.
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}