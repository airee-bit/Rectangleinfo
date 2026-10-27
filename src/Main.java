public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3,4);
        Rectangle r2 = new Rectangle(4.5,6.7);
        System.out.println("Rectangle 1 info:");
        r1.printRectangle();
        System.out.println("\nRectangle 2 info:");
        r2.printRectangle();

        System.out.println("\2Changed length to 10");
        r2.setLength(10);
        r2.printRectangle();
    }
}
