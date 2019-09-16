package 多线程相关问题;

public class Stopthread {
    public static void main(String[] args) throws InterruptedException {
        Action action=new Action();
        Thread thread=new Thread(action,"t1");
        thread.start();

        action.srtStopped(true);
        thread.join();
        Thread thread2=new Thread(() ->{
            if (!Thread.currentThread().isInterrupted()){
                System.out.println(123456);
            }
        },"t2");
        thread2.start();
        Thread.interrupted();
        thread2.join();
    }
    private static class Action implements Runnable{
        //线程安全问题,确保可见性
        private volatile boolean flag=false;
        @Override
        public void run(){
            if (!flag){
                System.out.printf("线程[%s]正在执行\n",Thread.currentThread().getName());
            }
        }
        public void srtStopped(boolean flag){
            if (flag=true){
                this.flag=flag;
            }
        }
    }
}
