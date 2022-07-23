public class Dog {
    private String name;
    private int age;

    public Dog() {
        this("Default Name", 5);
        System.out.println("Default constructor called");
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println("Name: " + name + " Age: " + age);
    }

}
