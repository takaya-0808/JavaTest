public class ClassInheritance2 {
    public static void main() {
        new Latifa();
    }
}

class Chara {
    Chara(String name) {
        System.out.println(name+"が生成されました。");
    }
    Chara(String name, int hp) {
        System.out.println(name+"のHPは"+hp+"です。");
    }
}

class Latifa extends Chara {
    Latifa() {
        super("ラティファ");
    }
}