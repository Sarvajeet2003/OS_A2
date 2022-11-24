public class ThreadRunner {
    public void show() throws Exception{
        System.out.println(Thread.currentThread().getName());
            Thread t1 = new Thread(new ThreadDownloader());
            t1.start();
            t1.join();
            t1.interrupt();
            System.out.println("FIle is ready");

            ThreadDownloader d1 = new ThreadDownloader();
            for(int i=0;i<10;i++){
                Thread t2 = new Thread(new ThreadDownloader(d1));
            }
    }
}
