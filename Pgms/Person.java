public class Person
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void introduce() 
    {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) 
    {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        
        person1.introduce();
        person2.introduce();
    }
}
