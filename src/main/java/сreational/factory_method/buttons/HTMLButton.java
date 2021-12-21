package сreational.factory_method.buttons;

import сreational.factory_method.buttons.Button;

/**
 * Реализация HTML кнопок.
 */
public class HTMLButton implements Button {
    @Override
    public void render() {
        // Вернуть HTML-код кнопки.
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
       //"Навесить на кнопку обработчик события браузера.
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
