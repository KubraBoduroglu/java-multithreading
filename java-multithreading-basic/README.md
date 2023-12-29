## MULTITHREADING IN JAVA

* In Java there are 2 main ways to creating a new thread.
1. Extending Thread Class
    * Have a class that extends a `Thread` class.
    * Override the RUn method of `Thread` class.

    * Use `start()` if you want multiple concurrent thread.
    * If one thread has an exception this doesn't stop other threads, even if this is the main thread.

2. Implementing Runnable Interface
    * When you implement the `Runnable` interface, only thing you have to do is have your own implementation of thr Run  method.
    * We cant call start method anymore because we don't extend `Thread` class.
    * There is one more thing we should do, and that is creating a `Thread()` object which implements `Runnable`.

#### Which One We Should Use?
Although no need to write extra line when using extends `Thread`, there is a bigger advantage of using `Runnable`.  
If you extend `Thread` class you can't extend any other class. Java doesn't allow multiple inheritance.  
You can only be a subclass of one class.  
But Java doesn't limit interfaces you can implement.   