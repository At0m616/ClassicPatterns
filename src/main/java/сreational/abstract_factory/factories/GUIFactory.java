package сreational.abstract_factory.factories;

import сreational.abstract_factory.buttons.Button;
import сreational.abstract_factory.checkboxes.Checkbox;
/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
