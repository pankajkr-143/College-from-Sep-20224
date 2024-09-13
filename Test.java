public class Test {
    public void divide(int a, int b){
        try {
            int c = a/b;
        } catch (Exception e) {
            System.out.println("Exception ");

            // TODO: handle exception
        }
        finally{
            System.out.println("Finally");
        }
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.divide(0, 3);
    }
}
