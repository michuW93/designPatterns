# Singleton - has everything already been told?

We all have heard about Singleton design pattern and we all know that it ensures that we have only one instance with easy access. Cool!

Let's try to implement it, first let's try with the most popular way - private static final field, private constructor and public method to create it.

![img.png](ClassicSingleton/img_classicSingletonCode.png)

Okay, so we finished? No.
Let's write test for our classic singleton and run it.

![img.png](ClassicSingleton/img_classicSingletonTest.png)

Cool, seems it works. Let's add another test with threads creating singleton instance.

![img.png](ClassicSingleton/img_classicSingletonMultipleThreadsTestFail.png)

it failed but wait, not always (notice, I didn't change a single character):

![img.png](ClassicSingleton/img_classicSingletonMultipleThreadsWorks.png)

now it's even worse - usually our test pass, but sometimes it fails. Okay, using threads you can expect non-deterministic result, but it's really easy to fall into this pit and waste whole day to look for a bug.
Let's try to make it safer and let's synchronize our method.

![img.png](SynchronizedSingleton/img_synchronizedSingletonCode.png)

Now we can run the same tests which we run for classic singleton (please notice that even times are quite similar, without synchronization it's slightly faster)

![img.png](SynchronizedSingleton/img_synchronizedSingletonTest.png)

and let's run test with threads on synchronized singleton:

![img.png](SynchronizedSingleton/img_synchronizedSingletonMultipleThreadsTest.png)

we can run it a million times and will always pass, unlike classic singleton. The last approach which is presented in Joshua Bloch's Effective Java as the best options in most cases is single element enum class

![img.png](EnumSingleton/img_enumSingletonCode.png)

This approach automatically handles serialization and ensures a robust defense against multiple instantiations, even in the presence of advanced serialization or reflection attacks. Keep in mind that if your Singleton needs to extend a superclass other than Enum, this approach won’t be suitable.

Let's run test for this version of singleton:
![img.png](EnumSingleton/img_enumSingletonTest.png)

as we can see it's even much faster than classic singleton.