package сreational.factory_method.factory;

import сreational.factory_method.buttons.Button;
import сreational.factory_method.buttons.HTMLButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
