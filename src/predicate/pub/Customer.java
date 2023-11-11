/**
 * Create by saurabh
 * Date: 11/11/23
 * Project Name: Java-8
 */
package predicate.pub;

public class Customer {
    String name;
    int age;
    Boolean isCouple;

    public Customer(String name, int age, Boolean isCouple) {
        this.name = name;
        this.age = age;
        this.isCouple = isCouple;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getCouple() {
        return isCouple;
    }

    public void setCouple(Boolean couple) {
        isCouple = couple;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCouple=" + isCouple +
                '}';
    }
}
