public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Duck duck = new Duck();
        System.out.println(dog.getName());
        System.out.println(dog.sound());
        System.out.println(cat.getName());
        System.out.println(cat.sound());
        System.out.println(duck.getName());
        System.out.println(duck.sound());

    }
}