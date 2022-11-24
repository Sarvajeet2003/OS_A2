public class ThreadDownloader implements Runnable{

    int count;
    public ThreadDownloader(ThreadDownloader d1) {
        d1.count=100;
        System.out.println(d1.count);
    }

    public ThreadDownloader() {
    }

    @Override
    public void run() {
        System.out.println("Downloading thread: "+ Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
