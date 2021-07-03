public class ClassInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
    }
}

class Animal {
    int power = 100;
    void run() {
        System.out.println(power);
    }
}
class Cat extends Animal {
    int power = 200;
    void run(int power) {
        super.run();
    }
}