**Прототип — это порождающий паттерн, который позволяет копировать объекты любой сложности без привязки к их конкретным классам.**

Применимость: Паттерн Прототип реализован в базовой библиотеке Java посредством интерфейса Cloneable.
Любой класс может реализовать этот интерфейс, чтобы позволить собственное клонирование.
java.lang.Object#clone() (класс должен реализовать интерфейс java.lang.Cloneable)

Признаки применения паттерна: Прототип легко определяется в коде по наличию методов clone, copy и прочих.


Рассмотрим пример реализации Прототипа без использования интерфейса Cloneable.

cache:
Вы можете добавить в программу фабрику прототипов, которая будет хранить каталог прототипов.
Таким образом, вы сможете запрашивать у фабрики новые объекты, описывая нужные вам свойства.
Фабрика будет искать соответствующий прототип в кеше и возвращать вам копию.