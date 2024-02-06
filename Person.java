public class Person {

    String name = "";
    final int age = 18;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public static void main(String[] args) {

        Person person = new Person();
        person.name = "Venkatesh";

        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
