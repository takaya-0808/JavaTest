public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] nums = new int[3];
            int a = nums[4];
            System.out.println("処理が完了しました。");
        } catch( ArrayIndexOutOfBoundsException e ) {
            System.out.println("範囲外の要素にアクセスしようとしました。");
        }
    }
}