package thread.start.test;

import static util.MyLogger.log;

public class StartTest1Main {

    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        counterThread.start();

    }

    static class CounterThread extends Thread{

        @Override
        public void run() {
            for (int value = 1; value <= 5; value++) {
                log("value: " + value);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
