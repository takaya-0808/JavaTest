public class ExceptionHandling2 {
    public static void main(String[] args) {
        try {
            String name = null;
            name.equals(100);
            Class.forName("");
            System.out.println("処理が完了しました。");
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("ぬるぽか配列の範囲外にアクセスしようとしました。");
        } catch (Exception e) {
            System.out.println("何らかの例外が発生しました。");
            
        }
    }
}