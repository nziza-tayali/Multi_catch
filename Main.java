import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter first number (x): ");
            int x = Integer.parseInt(sc.nextLine());
            
            System.out.print("Enter second number (y): ");
            int y = Integer.parseInt(sc.nextLine());
            
            
            int z = x / y;
            System.out.println("Result of x / y = " + z);
            
            
            // int[] numbers = {10, 20};
            
            // System.out.println("Accessing 3rd element: " + numbers[2]);
            
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception caught: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught: " + e);
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e);
        } finally {
            sc.close();
        }
    }
}