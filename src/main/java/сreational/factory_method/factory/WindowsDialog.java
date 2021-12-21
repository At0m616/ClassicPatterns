package сreational.factory_method.factory;

import сreational.factory_method.buttons.Button;
import сreational.factory_method.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
