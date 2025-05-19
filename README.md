# Rectangle
Implement the Rectangle class by editing the provided file. **You should not need to edit the Main file, which is meant to help test your program.**

It should have two fields (variables): width and height.

It should also have the following methods with no parameters:
* calculateArea() returns the area calculated from `this.width` and `this.height`
* calculatePerimeter() returns the perimeter
* toString() returns a string representation of the rectangle (ex: "4x8 rectangle")

## Bonus 1: fitsInside()
Implement a method `public boolean fitsInside(Rectangle otherRect)` method that returns true if the rectangle would fit inside `otherRect`.

Test the method by uncommenting the code included in Main.

## Bonus 2: Inheritance
Read the "Inheritance in Java" and "super() in Java" section of [this page](https://www.codecademy.com/learn/learn-java/modules/learn-java-inheritance-and-polymorphism/cheatsheet).

Create a new class Square that is a subclass of Rectangle. Square's constructor should take only one parameter (length), and should call the Rectangle constructor.

## Super Bonus: Abstract Classes and Polymorphism
Read [Java's Inheritance Mechanism](https://runestone.academy/ns/books/published/javajavajava/javas-inheritance-mechanism.html) and [Abstract Classes](https://runestone.academy/ns/books/published/javajavajava/abstract-classes-interfacesand-polymorphism.html).

Create an abstract class `Polygon` with the methods calculateArea() and calculateParameter(), and create several classes (ex: Triangle, Rectangle, Octagon) that inherit from Polygon and override the methods.
