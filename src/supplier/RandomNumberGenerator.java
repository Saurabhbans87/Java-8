/**
 * Create by saurabh
 * Date: 14/11/23
 * Project Name: Java-8
 */
package supplier;

public class RandomNumberGenerator {

    public static void main(String args[]) {
        RandomNumberGenerator obj1 = new RandomNumberGenerator();
        // range is from 1 to 50
        int rand = obj1.randomNumberWithRange(1, 50);
        System.out.println(rand);
        System.out.println("******************Example*****************");
        double randomeNumber1 = Math.random();
        System.out.println(randomeNumber1);
        System.out.println("******************Example*****************");
        double randomeNumber2 = Math.random();
        System.out.println(randomeNumber2);
        System.out.println("******************Random number 1 to 5*****************");
        double randomeNumber3 = Math.random()*5;
        int randomeNumber4 = (int) (Math.random()*5);
        System.out.println(randomeNumber3);
        System.out.println(randomeNumber4);

    }
    //defining method for a random number generator
    int randomNumberWithRange(int min, int max) {
        int range = (max - min) + 1;
        System.out.println(range);
        return (int) (Math.random() * range) + min;
    }

}
