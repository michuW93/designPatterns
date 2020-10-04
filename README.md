# designPatterns
Design patterns in java

1. **Facade**: https://stackoverflow.com/a/64160519/4952262

2. **Template method**: The Template Method Pattern defines the skeleton
of an algorithm in a method, deferring some steps to
subclasses. Template Method lets subclasses redefine
certain steps of an algorithm without changing the
algorithm’s structure.

General receipe is in CaffeineBeverage while in Tea and Coffe extends this class and provide implementation for it's own methods. `boilWater` and `pourInCup` already have logic in abstract class while methods used strictly for tea/coffe are abstract so CaffeineBeverage doesn't know about implementation and tea/coffee classes provide logic for them.
