import java.io.FileNotFoundException;
    class A{
        public void printName() throws FileNotFoundException{
            System.out.println("Value-A");
        }
    }

    class B extends A{
        public void printName() throws NullPointerException{
            System.out.println("Value-B");
        }
    }
    public class main {
        public static void main(String[] args) throws Exception {
            A a = new B();
            a.printName();

        }
        
    }
    

    

