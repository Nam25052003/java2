
package Phan2;


public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread o1 = new OddThread();
        EvenThread e1 = new EvenThread();
        
        o1.start();
        o1.join();
        e1.start();
    }
}
