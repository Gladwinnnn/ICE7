import java.util.*;

public class TestPartAndQuantity{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        PartAndQuantityEntry partAndQuantityEntry = new PartAndQuantityEntry();
        boolean isValid = false;

        while (!isValid){
            try{
                System.out.print("Enter part> ");
                int part = scanner.nextInt();
                System.out.println();

                System.out.print("Enter quantity> ");
                int quantity = scanner.nextInt();
                System.out.println();

                partAndQuantityEntry.enterPartAndQuantity(part,quantity);
                isValid = true;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}