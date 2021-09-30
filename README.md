# designPatterns
Design patterns in java

1. **Facade**: https://stackoverflow.com/a/64160519/4952262, method which do many things inside so client just call this method and everything happens inside (one method call instead of much more)

The facade pattern is typically used when a simple interface is required to access a complex system,
a system is very complex or difficult to understand,
an entry point is needed to each level of layered software, or
the abstractions and implementations of a subsystem are tightly coupled.

2. **Template method**: The Template Method Pattern defines the skeleton
of an algorithm in a method, deferring some steps to
subclasses. Template Method lets subclasses redefine
certain steps of an algorithm without changing the
algorithm’s structure.

General receipe is in CaffeineBeverage while in Tea and Coffe extends this class and provide implementation for it's own methods. `boilWater` and `pourInCup` already have logic in abstract class while methods used strictly for tea/coffe are abstract so CaffeineBeverage doesn't know about implementation and tea/coffee classes provide logic for them.

What the template method is saying is that sometimes, you need to do some common logic, with some sub-class specific logic interleaved with it. So the specific logic that you want to leave for each sub-class is defined as an abstract / virtual method that is left for the concrete class to implement, while the common business logic goes around it.

3. **Singleton**: The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.
private constructor, private static instance, can be synchronized to avoid creating two instances by other threads and can be done via enum to avoid serialization problems (This approach (enum) is similar to the public field approach, but it is more concise, provides the serialization machinery for free, and provides an ironclad guarantee against multiple instantiation, even in the face of sophisticated serialization or reflection attacks. This approach may feel a bit unnatural, but a single-element enum type is often the best way to implement a singleton. Note that you can’t use this approach if your singleton must extend a superclass other than Enum (though you can declare an enum to implement interfaces).)
The singleton design pattern solves problems like:

How can it be ensured that a class has only one instance?
How can the sole instance of a class be accessed easily?
How can a class control its instantiation?
How can the number of instances of a class be restricted?
How can a global variable be accessed?
The singleton design pattern describes how to solve such problems:

Hide the constructor of the class.
Define a public static operation (getInstance()) that returns the sole instance of the class.
The key idea in this pattern is to make the class itself responsible for controlling its instantiation (that it is instantiated only once).
The hidden constructor (declared private) ensures that the class can never be instantiated from outside the class.
The public static operation can be accessed easily by using the class name and operation name (Singleton.getInstance()).

4. **Decorator**: https://stackoverflow.com/questions/2707401/understand-the-decorator-pattern-with-a-real-world-example
The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

5. **Observer pattern**: The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.
So there is a subject and when something change in subject then observators are getting notified. Observators should subscribe and unsubcribe subject when they want and as many times as they want. Example: listeners on e.g buttons in swing.
One to Many relationship

6. **Factory method**: good when we have:
if("cheese") then create CheesePizza
else if("ham") then create HamPizza
etc.

Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

7. **Command pattern**: turns a request into a stand-alone object (command) that contains all informations about the request. Command is passed to invoker object and invoker object decide to which class it should be passed to be executed.

8. **Adapter pattern**:

9. **Iterator pattern**: provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
Two menus, one works on arraylist, second on array. So need to use interface iterator then for print both menus we can use one method.

10. **Strategy pattern**:

11. **State**:

12. **Builder**: when you have many constructors you can use builder. There are two objects e.g Account and Acocunt Builder. In build() method you create Account acc = new Account();

12. **Combinator**: when you want to check if customer is valid eg. isPhoneNumberValid(), isEmailValid() then you can create a class (CustomerValidationService) and method (isValidCustomer()) which contains both methods mentioned above.

13. **Bridge method**: prevents a `Cartesian product` complexity explosion.
Example: ThreadScheduler can be preemptive and cooperative, it can also run on windows and linux and we finish with WinPTS, LinuxPTS, WindowsCTS, LinuxCTS 
or we have Shape(Circle, Square) and Rendering(Vector, Raster) so to not finish with CircleVector, CircleRaster, SquareVector, SquareRaster
