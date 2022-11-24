import java.util.*;

class counter extends Thread{
    long  cA;
    long cB;
    long  cC;

    public void countA(){
        for(long  i=1;i<=Math.pow(2,32);i++){
            cA++;
        }
    }

   public void countB(){
       for(long i=1;i<=Math.pow(2,32);i++){
           cB++;
       }
   }

   public void countC(){
       for(long i=1;i<=Math.pow(2,32);i++){
           cC++;
       }
   }

    public static void main(String[] args) throws Exception {
        var c1 = new counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                    c1.countA();
            }
        });

       Thread t2 = new Thread(new Runnable() {
           @Override
           public void run() {
               c1.countB();
           }
       });

       Thread t3 = new Thread(new Runnable() {
           @Override
           public void run() {
               c1.countC();
           }
       });

        t1.start();
       t2.start();
       t3.start();
        t1.join();
       t2.join();
       t3.join();

//        System.out.println(c1.cA+" "+c1.cB+" "+c1.cC);
    }
}


public class Main {
    public static void main(String[] args) throws Exception {
        ThreadRunner t1 = new ThreadRunner();
        t1.show();
    }
}
