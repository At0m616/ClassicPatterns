package сreational.abstract_factory.factories;

import сreational.abstract_factory.buttons.Button;
import сreational.abstract_factory.buttons.WindowsButton;
import сreational.abstract_factory.checkboxes.Checkbox;
import сreational.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
