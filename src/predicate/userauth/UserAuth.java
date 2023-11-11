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
        System.out.println("Valid user credential are:");
        for (User user:userList) {
            if(userPredicate.test(user)){
                System.out.println(user);
            }
        }
        System.out.println("Valid user credential are:");
        Predicate<User> userPredicate1 = user -> user.getUserName().equals("Test")&&user.getPassword().equals("Test");
        List<User> authUser = userList.stream().filter(userPredicate1).collect(Collectors.toList());
        System.out.println(authUser);
    }
}
