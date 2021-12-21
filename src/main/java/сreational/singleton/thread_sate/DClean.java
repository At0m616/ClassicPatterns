package сreational.singleton.thread_sate;

public final class DClean {
    private static volatile DClean instance;

    private DClean() {
    }

    public static DClean getInstance() {
        DClean result = instance;
        if (result != null) {
            return result;
        }
        synchronized (DClean.class) {
            if (instance == null) {
                instance = new DClean();
            }
            return instance;
        }
    }
}
