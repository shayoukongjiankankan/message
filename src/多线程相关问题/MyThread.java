package 多线程相关问题;

import javax.xml.namespace.QName;

public class MyThread {
    public static void main(String[] args) throws InterruptedException {
//        Thread thread=new Thread(() ->{//new Runnable(){}方法
//            System.out.printf("线程[%s]正在执行\n",Thread.currentThread().getName());
//        }, "alibaba");
//        thread.start();
//        System.out.printf("线程[%s]正在执行",Thread.currentThread().getName());
//        System.out.println();
//        System.out.print("线程[%s]"+thread.getName()+thread.isAlive());

//        threadJoinonebyone();
//        threadLoop();
//        threadSleep();
        threadWait();

    }

    private static void threadWait() {
        Thread thread1=new Thread(MyThread::run,"t1");
        Thread thread2=new Thread(MyThread::run,"t2");
        Thread thread3=new Thread(MyThread::run,"t3");
        threadStartandWait(thread1);
        threadStartandWait(thread2);
        threadStartandWait(thread3);
    }

    private static void threadStartandWait(Thread thread) {
        if (Thread.State.NEW.equals(thread.getState())){
            thread.start();
        }
        while (thread.isAlive()){
            synchronized (thread){
                try {
                    thread.wait();//到底是谁通知 Thread的notify
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void threadSleep() throws InterruptedException {
        Thread thread1=new Thread(MyThread::run,"t1");
        Thread thread2=new Thread(MyThread::run,"t2");
        Thread thread3=new Thread(MyThread::run,"t3");

        thread1.start();
        while (thread1.isAlive()){
            Thread.sleep(0);
        }
        thread2.start();
        while (thread2.isAlive()){
            Thread.sleep(0);
        }

        thread3.start();
        while (thread3.isAlive()){
            Thread.sleep(0);
        }
    }

    private static void threadLoop() {//自旋 Spin
        Thread thread1=new Thread(MyThread::run,"t1");
        Thread thread2=new Thread(MyThread::run,"t2");
        Thread thread3=new Thread(MyThread::run,"t3");

        thread1.start();
        while (thread1.isAlive()){

        }
        thread2.start();
        while (thread2.isAlive()){

        }

        thread3.start();
        while (thread3.isAlive()){

        }
    }

    private static void threadJoinonebyone() throws InterruptedException {
        Thread thread1=new Thread(MyThread::run,"t1");
        Thread thread2=new Thread(MyThread::run,"t2");
        Thread thread3=new Thread(MyThread::run,"t3");
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
    }


    private static void run() {
        System.out.printf("线程[%s]正在执行\n",Thread.currentThread().getName());
    }

}
