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
            if(scanner.isIntNumber() && scanner.getNumber() > 1){
                System.out.print("Сколько людей считать? ");
                allPeople  = scanner.getNumber();
                if(scanner.isIntNumber() && scanner.getNumber() > 0){
                    turn = scanner.getNumber();
                    break;
                }

            }
            System.out.println("Извините, вы ввели неправильное число!");
        }
        //запуск метода решающего непосредственно задачу с передачей ему введеных параметров
        GameEmulator gameEmulator = new GameEmulator();
        gameEmulator.count(allPeople, turn);

    }





}


