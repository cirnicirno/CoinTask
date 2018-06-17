package CoinTask;

import java.util.HashSet;

public class Coins {

    HashSet<Integer> picked;


    public Coins(){

        picked = new HashSet<>();//используем хэшсет для подсчета индексов тех, кто уже получил монетку в одном туре игры

    }

    public void addOne(int index){
        if (picked.add(index)) {
            GameEmulator.people.get(index).setCoins(GameEmulator.people.get(index).getCoins() + 1);
        }
    }
    public void addTwo(int size){

        for (int i = 0; i < size; i++)
            //так как хэшсет возвращает false если в индекс уже есть в списке мы можем попробовать дать монетки всем
            //тем самым избавиться от проблем с реализацией и описанием замкнутого круга для корректных переходов
        if (picked.add(i)) {
        GameEmulator.people.get(i).setCoins(GameEmulator.people.get(i).getCoins()+2);
        }
    }
    public void clear() {
        //отчищаем set в конце каждого тура
        picked.clear();

    }

}
