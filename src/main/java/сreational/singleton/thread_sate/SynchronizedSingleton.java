package сreational.singleton.thread_sate;

public final class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    public String value;

    private SynchronizedSingleton(String value) {
        this.value = value;
    }

    public static synchronized SynchronizedSingleton getInstance(String value) {
        if (instance == null) {
            instance = new SynchronizedSingleton(value);
        }
        return instance;
    }
}
