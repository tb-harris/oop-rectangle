public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 8);
        Rectangle rect2 = new Rectangle(5, 10);
        Rectangle footballField = new Rectangle(360, 160);

        System.out.println("The area of a 4x8 rectangle is " + rect1.calculateArea());
        System.out.println("The area of a 5x10 rectangle is " + rect2.calculateArea());

        System.out.println("The area of a football field is " + footballField.calculateArea() + " sq ft");

        System.out.println("The perimeter of a football field is " + footballField.calculatePerimeter() + " ft");
    }
}