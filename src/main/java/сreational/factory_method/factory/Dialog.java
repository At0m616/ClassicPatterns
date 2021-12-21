package сreational.factory_method.factory;

import сreational.factory_method.buttons.Button;
/**
 * Базовый класс фабрики. Заметьте, что "фабрика" – это всего лишь
 * дополнительная роль для класса. Он уже имеет какую-то бизнес-логику, в
 * которой требуется создание разнообразных продуктов.
 */
public abstract class Dialog {

    public void renderWindow(){
        //...some code...
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
    /**
     * Подклассы будут переопределять этот метод, чтобы создавать конкретные
     * объекты продуктов, разные для каждой фабрики.
     */
    abstract Button createButton();
}
