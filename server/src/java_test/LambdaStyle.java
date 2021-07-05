public class LambdaStyle {
    public static void main(String[] args) {
        Chara ch = (int num) -> {
            System.out.println(num);
        };
        ch.move(100);
    }
}

@FunctionalInterface
interface Chara {
    void move(int num);
}