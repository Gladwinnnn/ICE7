public class Baby{
    private boolean isHungry;

    public void setIsHungry(boolean setStatus){
        isHungry = setStatus;
    }

    public void eat(String foodDescription) throws NotHungryException{
        if (isHungry){
            System.out.println("eating " + foodDescription);
        } else{
            throw new NotHungryException("rejects " + foodDescription);
        }
    }
}