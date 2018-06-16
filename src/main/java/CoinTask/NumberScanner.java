package CoinTask;

import java.util.Scanner;


public class NumberScanner {

    private int number;
    private Scanner in;
    private String line;

    public NumberScanner() {
        in = new Scanner(System.in);
    }

    public boolean isIntNumber(){
        line = in.nextLine();
        if(Validator.isInt(line) && Integer.parseInt(line) > 0){
            number = Integer.parseInt(line);
            return true;
        }
        return false;
    }

    public int getNumber(){
        return number;
    }
}

