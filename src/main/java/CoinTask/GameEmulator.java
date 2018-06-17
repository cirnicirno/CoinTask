package CoinTask;

import java.util.LinkedList;
import java.util.List;

public class GameEmulator {

    //задачу можно было бы решить набором уравнений, но я проведу полную симуляцию игрового процесса


    //создаем  LinkedList куда положим наших участников с их порядковыми номерами и "кошельками"
    //также делаем его публичным чтобы другие элементы могли без затруднений к нему обращаться
    public static List<People> people;

    public GameEmulator() {

    }

    public void count(int peopleAll, int turn) {


        people = new LinkedList<>();
        //Заполняем наш список
        for (int i = 0; i < peopleAll; i++) {

            People man = new People();
            man.setIndex(i);
            man.setCoins(0);
            people.add(man);
        }

        //начинаем игру
        PeopleKiller killer = new PeopleKiller(); //создаем экземпляры классов методы которых нам понадобятся внутри цикла
        Coins coins = new Coins();
        int position = 0; //изначальная позиция с которой начинается отсчет в каждом туре
        int counter = 0; //счетчик шагов

        //пока в списке не останется один человек игра не закончится
        while (people.size() != 1) {

            //следующий цикл повторяется turn раз, в ходе него посчитанные участники получают по однной монетке
            while (true) {
                if (position + 1 < people.size()) {
                    coins.addOne(position); //метод начисляет одну монетку
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
                        position = 0; //благодаря этому мы можем замыкнуть круг
                    }

                }

            }

            coins.addTwo(people.size());//отдаем всем кто не получил 1 монетку 2 монетки


            killer.remove(position); //убираем того, на ком остановился счет и отдаем его монетки следующему человеку
            coins.clear(); //отчищаем set в конце каждого тура
            counter = 0; //обнуляем счетчик

            //если убирается человек находившийся в очереди, то следующий отсчет начнется с стоящего в начале списка
            if (position == people.size()){
                position = 0;
            }
        }

        System.out.println("Номер счастливчика: " + people.get(0).getIndex() + "\nУнес монет: " + people.get(0).getCoins());


    }
}