
package exception3;


public class Lab3 {
    public static void main(String[] args) {
        int[] list=new int[10];
        try{
            System.out.println("Statement1");
            System.out.println(list[10]);
            System.out.println("Statement3");
        }

        catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
            }
//        catch (RuntimeException ex) {
//            System.out.println("RuntimeException");
//            }
//        catch (Exception ex) {
//            System.out.println("Exception");
//            }
        finally{
            System.out.println("Statement4");
        }
        System.out.println("Statement5");
    }
}
