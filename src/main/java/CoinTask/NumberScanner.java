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
        if(Validator.isInt(line)){ //валидатор проверяет является ли число int и вовращает false если что-то не так
            number = Integer.parseInt(line);
            return true;
        }
        return false;
    }

    public int getNumber(){
        return number;
    }
}

