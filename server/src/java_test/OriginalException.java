public class OriginalException {
    public static void main(String[] args) {
        try {
            throw new OriException();
        } catch (OriException e) {
            System.out.println("err");
        }
    }
}

class OriException extends Exception {}