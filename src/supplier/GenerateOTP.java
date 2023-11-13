/**
 * Create by saurabh
 * Date: 14/11/23
 * Project Name: Java-8
 */
package supplier;

import java.util.function.Supplier;

public class GenerateOTP {
    public static void main(String[] args) {
        Supplier<String> otpGenerator = () -> {
            String otp = "";
            for (int i=0;i<5;i++){
                otp =otp + (int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println(otpGenerator.get());
    }
}
