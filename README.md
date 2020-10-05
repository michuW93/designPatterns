# designPatterns
Design patterns in java

1. **Facade**: https://stackoverflow.com/a/64160519/4952262

2. **Template method**: The Template Method Pattern defines the skeleton
of an algorithm in a method, deferring some steps to
subclasses. Template Method lets subclasses redefine
certain steps of an algorithm without changing the
algorithm’s structure.

General receipe is in CaffeineBeverage while in Tea and Coffe extends this class and provide implementation for it's own methods. `boilWater` and `pourInCup` already have logic in abstract class while methods used strictly for tea/coffe are abstract so CaffeineBeverage doesn't know about implementation and tea/coffee classes provide logic for them.

3.**Singleton**: The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.
private constructor, private static instance, can be synchronized to avoid creating two instances by other threads and can be done via enum to avoid serialization problems (This approach is similar to the public field approach, but it is more concise,
provides the serialization machinery for free, and provides an ironclad guarantee
against multiple instantiation, even in the face of sophisticated serialization or
reflection attacks. This approach may feel a bit unnatural, but a single-element
enum type is often the best way to implement a singleton. Note that you can’t
use this approach if your singleton must extend a superclass other than Enum
(though you can declare an enum to implement interfaces).)
