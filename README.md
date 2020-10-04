# designPatterns
Design patterns in java

Facade: https://stackoverflow.com/a/64160519/4952262

Template method: The Template Method Pattern defi nes the skeleton
of an algorithm in a method, deferring some steps to
subclasses. Template Method lets subclasses redefi ne
certain steps of an algorithm without changing the
algorithm’s structure.

General receipe is in CaffeineBeverage while in Tea and Coffe extends this class and provide implementation for it's own methods, `boilWater` and `pourInCup` already have logic in abstract class while methods used only for tea/coffe are abstract so CaffeineBeverage doesn't know about implementation.
