public class ClassInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.power);
        cat.run(50);
    }
}

class Animal {
    int power = 100;
}
class Cat extends Animal {
    int power = 200;
    void run(int power) {
        System.out.println(power);
        System.out.println(this.power);
        System.out.println(super.power);
    }
}