package сreational.singleton.thread_sate;

import java.util.ArrayList;

public final class DoubleCheckSingleton {
    // Поле обязательно должно быть объявлено volatile, чтобы двойная проверка
    // блокировки сработала как надо.
    private static volatile DoubleCheckSingleton instance;

    public String value;

    private DoubleCheckSingleton(String value) {
        this.value = value;
    }

    public static DoubleCheckSingleton getInstance(String value) {
        // Техника, которую мы здесь применяем называется «блокировка с двойной
        // проверкой» (Double-Checked Locking). Она применяется, чтобы
        // предотвратить создание нескольких объектов-одиночек, если метод будет
        // вызван из нескольких потоков одновременно.
        //
        // Хотя переменная `result` вполне оправданно кажется здесь лишней, она
        // помогает избежать подводных камней реализации DCL в Java.
        DoubleCheckSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(DoubleCheckSingleton.class) {
            if (instance == null) {
                instance = new DoubleCheckSingleton(value);
            }
            return instance;
        }
    }
}
