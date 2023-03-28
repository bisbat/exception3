
package exception3;


public class Lab2 {
    public static void main(String[] args) {
        int[] list=new int[10];
        try{
            System.out.println("List[10] is "+list[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("rrayIndexOutOfBoundsException");
        }
        catch(RuntimeException ex){
            System.out.println("");
        }
        catch(Exception ex){
            System.out.println("");
        }
    }
}
