
package Phan2;

public class EvenThread extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            if ((i%2==0)) {
                System.out.print(" "+i);
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}