// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fish fish=new Fish();
        Parrot parrot=new Parrot();
        Cat cat=new Cat();
        Dog dog=new Dog();
        fish.setName("Goldy");
        fish.setAge(3);
        parrot.setName("Kesha");
        parrot.setAge(8);
        cat.setName("Rozhok");
        cat.setAge(15);
        dog.setName("Bobik");
        dog.setAge(17);
        System.out.println("The name of the fish: "+fish.getName());
        System.out.println("Age: "+fish.getAge());
        System.out.println("The name of the parrot: "+parrot.getName());
        System.out.println("Age: "+parrot.getAge());
        System.out.println("The name of the cat: "+cat.getName());
        System.out.println("Age: "+cat.getAge());
        System.out.println("The name of the dog: "+dog.getName());
        System.out.println("Age: "+dog.getAge());
    }
}