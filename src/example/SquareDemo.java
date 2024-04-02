/**
 * Create by saurabh
 * Date: 28/03/24
 * Project Name: Java-8
 */
package example;

public class SquareDemo {
    public static void main(String[] args) {
        Square square = (x) -> x * x;
        int calculate = square.calculate(5);
        System.out.println(calculate);
    }
}
