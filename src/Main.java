public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(4, 8);
        Rectangle rect2 = new Rectangle(5, 10);
        Rectangle footballField = new Rectangle(360, 160);

        // Area
        System.out.println("The area of a 4x8 rectangle is " + rect1.calculateArea());
        System.out.println("The area of a 5x10 rectangle is " + rect2.calculateArea());

        System.out.println("The area of a football field is " + footballField.calculateArea() + " sq ft");

        System.out.println("The perimeter of a football field is " + footballField.calculatePerimeter() + " ft");

        System.out.println("A football field is a " + rect1);

        /*
        if (rect1.fitsInside(rect2)) {
            System.out.println("A 4x8 rectangle fits inside a 5x10 rectangle");
        } else {
            System.out.println("A 4x8 rectangle does not fit inside a 5x10 rectangle???");
        }

        if (footballField.fitsInside(rect1)) {
            System.out.println("A football field fits inside a 4x8 rectangle (That doesn't seem right...)");
        } else {
            System.out.println("A football field does not fit inside a 4x8 rectangle.");
        }

         */
    }
}