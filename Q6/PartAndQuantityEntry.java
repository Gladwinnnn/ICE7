public class PartAndQuantityEntry{
    public static void enterPartAndQuantity(int partNumber, int quantityOrdered) throws IllegalArgumentException{
        if (partNumber < 0 || partNumber > 999 || quantityOrdered < 1 || quantityOrdered > 5000){
            throw new IllegalArgumentException("Please enter a valid number!");
        } else{
            System.out.print("successfully inserted order");
        }
    }
}