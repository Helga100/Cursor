package HW4.private_zoo;

public class Main {
    public static void main(String[] args) {

        Elephant elephant = new Elephant("Dambo");
        Fox fox = new Fox("Alyssa");
        Monkey monkey = new Monkey("Chango");
        Tiger tiger = new Tiger("Diego");
        System.out.println("Elephant`s name is " + elephant.name);
        elephant.color();
        elephant.say();
        elephant.sleep();
        elephant.weight();
        System.out.println("Fox`s name is " + fox.name);
        fox.color();
        fox.say();
        fox.sleep();
        fox.weight();
        System.out.println("Monkey`s name is " + monkey.name);
        monkey.color();
        monkey.say();
        monkey.sleep();
        monkey.weight();
        System.out.println("Tiger`s name is " + tiger.name);
        tiger.color();
        tiger.say();
        tiger.sleep();
        tiger.weight();
    }
}
