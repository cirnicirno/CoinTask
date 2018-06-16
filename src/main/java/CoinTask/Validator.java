package CoinTask;

public class Validator {

    public Validator() {
    }

    public static boolean isInt(String number){
        try{
            Integer.parseInt(number);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
