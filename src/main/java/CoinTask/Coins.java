package CoinTask;

import java.util.HashSet;

public class Coins {

    HashSet<Integer> picked = new HashSet<>();


    public Coins(){

    }

    public void addOne(int index){
        if (picked.add(index)) {
            GameEmulator.people.get(index).setCoins(GameEmulator.people.get(index).getCoins() + 1);
            //System.out.println("Индекс: " + GameEmulator.people.get(index).index+ " Монет: "+ GameEmulator.people.get(index).coins);
        }
    }
    public void addTwo(int size){

        for (int i = 0; i < size; i++)
        if (picked.add(i)) {
        GameEmulator.people.get(i).setCoins(GameEmulator.people.get(i).getCoins()+2);
            //System.out.println("Индекс: " + GameEmulator.people.get(i).index+ " Монет: "+ GameEmulator.people.get(i).coins);
        }
    }
    public void clear() {

        picked.clear();

    }

    }
