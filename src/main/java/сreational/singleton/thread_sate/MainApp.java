package сreational.singleton.thread_sate;

import сreational.singleton.simple_singleton.Singleton;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            DoubleCheckSingleton singleton = DoubleCheckSingleton.getInstance("FOO");
            SynchronizedSingleton singleton2 = SynchronizedSingleton.getInstance("BAR");
            System.out.println("1 DoubleCheck " + singleton.value + singleton.hashCode());
            System.out.println("2 Synchronized " + singleton2.value + singleton2.hashCode());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            DoubleCheckSingleton singleton = DoubleCheckSingleton.getInstance("BAR");
            SynchronizedSingleton singleton2 = SynchronizedSingleton.getInstance("FOO");
            System.out.println("3 DoubleCheck " + singleton.value + singleton.hashCode());
            System.out.println("4 Synchronized " + singleton2.value + singleton2.hashCode());
        }
    }
}
