package CoinTask;




public class ConsoleWorker {

    public ConsoleWorker(){

    }

    public void insert(){
        int allPeople;
        int turn;
        NumberScanner scanner = new NumberScanner();

        while (true){
            System.out.print("Сколько всего людей? ");
            if(scanner.isIntNumber()){
                System.out.print("Сколько людей считать? ");
                allPeople  = scanner.getNumber();
                if(scanner.isIntNumber()){
                    turn = scanner.getNumber();
                    break;
                }

            }
            System.out.println("Извините, вы ввели неправильное число!");
        }
        Ring ring = new Ring();
        ring.count(allPeople, turn);

    }





}


