import java.util.Scanner;

public class CartesianSystem {
    static int x1, x2, y1, y2, x3, x4, y3, y4;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Coordinates for line one: ");
        System.out.println("Enter the value of x1: ");
        x1 = sc.nextInt();
        System.out.println("Enter the value of x2: ");
        x2 = sc.nextInt();
        System.out.println("Enter the value of y1: ");
        y1 = sc.nextInt();
        System.out.println("Enter the value of y2: ");
        y2 = sc.nextInt();

        System.out.println("Coordinates for line two: ");
        System.out.println("Enter the value of x3: ");
        x3 = sc.nextInt();
        System.out.println("Enter the value of x4: ");
        x4 = sc.nextInt();
        System.out.println("Enter the value of y3: ");
        y3 = sc.nextInt();
        System.out.println("Enter the value of y4: ");
        y4 = sc.nextInt();

        Double length1 = Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
        Double length2 = Math.sqrt(Math.pow(x4-x3, 2)+ Math.pow(y4-y3, 2));

        System.out.println(length1);
        System.out.println(length2);

        //using java equals is strictly necessary
        boolean equal = length1.equals(length2);
        System.out.println("The length of the two line are same: " + equal);
        int compare = length1.compareTo(length2);
        if(compare == 0) {
            System.out.println("Both the lines are equal");
        } else if (compare < 0) {
            System.out.println("length of line 1 is more than length of line 2");
        } else {
            System.out.println("Length of line 1 is less than length of line 2");
        }
    }
}
