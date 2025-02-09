package Zoo;

abstract class Bird implements Flyable{
    private String name;
    private int age;

    public Bird(String name, int age){
        this.name = name;
        this.age = age;
    }

    abstract void makeSound(); 
}
