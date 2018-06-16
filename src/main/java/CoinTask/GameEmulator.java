package CoinTask;

import java.util.LinkedList;
import java.util.List;

public class GameEmulator {

    public static List<People> people = new LinkedList<>();

    public GameEmulator() {

    }

    public void count(int peopleAll, int turn) {

        PeopleKiller killer = new PeopleKiller();
        Coins coins = new Coins();

        for (int i = 0; i < peopleAll; i++) {

            People man = new People();
            man.setIndex(i);
            man.setCoins(0);
            people.add(man);
        }

        int position = 0;
        int counter = 0;
        int delPosition = 0;
        while (people.size() != 1) {

            while (true) {
                if (position + 1 < people.size()) {
                    coins.addOne(position);
                    counter++;
                    if (counter == turn){
                        break;
                    }else{
                    position++;
                    }
                }else{
                    coins.addOne(position);
                    counter++;
                    if (counter == turn){
                        break;
                    }else{
                        position = 0;
                    }

                }

            }

            coins.addTwo(people.size());


            killer.remove(position);
            coins.clear();
            counter = 0;

            if (position == people.size()){
                position = 0;
            }
        }

        System.out.println("Номер счастливчика: " + people.get(0).getIndex() + "\nУнес монет: " + people.get(0).getCoins());


    }
}