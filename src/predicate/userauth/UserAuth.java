/**
 * Create by saurabh
 * Date: 11/11/23
 * Project Name: Java-8
 */
package predicate.userauth;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UserAuth {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Test","Test"));
        userList.add(new User("User","Password"));
        Predicate<User> userPredicate = user -> user.getUserName().equals("User") && user.getPassword().equals("Password");
        System.out.println("Valid credential are:");
        for (User user:userList) {
            if(userPredicate.test(user)){
                System.out.println(user);
            }
        }
    }
}
