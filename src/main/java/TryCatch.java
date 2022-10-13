public class TryCatch {
    public static void main(String[] args) {
        try {
            String[] abc = new String[]{"q", "a"};
            System.out.println(abc[3]);
        } catch (Exception e) {
            System.out.println("There is an error in code --- printing catch block");
        } finally {
            System.out.println("Successfully executed Try catch");
        }
    }
}
