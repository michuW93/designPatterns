# designPatterns
Design patterns in java

1. **Facade**: https://stackoverflow.com/a/64160519/4952262, method which do many things inside so client just call it one method and everything happens inside

2. **Template method**: The Template Method Pattern defines the skeleton
of an algorithm in a method, deferring some steps to
subclasses. Template Method lets subclasses redefine
certain steps of an algorithm without changing the
algorithm’s structure.

General receipe is in CaffeineBeverage while in Tea and Coffe extends this class and provide implementation for it's own methods. `boilWater` and `pourInCup` already have logic in abstract class while methods used strictly for tea/coffe are abstract so CaffeineBeverage doesn't know about implementation and tea/coffee classes provide logic for them.

3.**Singleton**: The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.
private constructor, private static instance, can be synchronized to avoid creating two instances by other threads and can be done via enum to avoid serialization problems (This approach (enum) is similar to the public field approach, but it is more concise, provides the serialization machinery for free, and provides an ironclad guarantee against multiple instantiation, even in the face of sophisticated serialization or reflection attacks. This approach may feel a bit unnatural, but a single-element enum type is often the best way to implement a singleton. Note that you can’t use this approach if your singleton must extend a superclass other than Enum (though you can declare an enum to implement interfaces).)

4.**Decorator**:https://stackoverflow.com/questions/2707401/understand-the-decorator-pattern-with-a-real-world-example
The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a fl exible alternative to subclassing for extending functionality.

5.**Observer pattern**: The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.
So there is a subject and when something change in subject then observators are getting notified. Observators should subscribe and unsubcribe subject when they want and as many times as they want. Example: listeners on e.g buttons in swing.
One to Many relationship
