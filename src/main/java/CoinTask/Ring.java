package CoinTask;

import java.util.LinkedList;
import java.util.List;

public class Ring {

    private int lastMan;
    private boolean allOneCoin = false;
    public static List<People> people = new LinkedList<>();
    private PeopleKiller killer = new PeopleKiller();
    private Coins coins = new Coins();

    public Ring(){

    }

    public void count(int peopleAll, int turn){

        for (int i = 1; i <= peopleAll; i++){

            People man = new People();
            man.setIndex(i);
            man.setCoins(0);
            people.add(man);
        }



        while (people.size() != 1){
/*
*если размер одного прохода превышает колличество оставшихся людей,
* то все получают одну монетку, а мы нахдим того, кто выйдет
 */
            if (people.size() <= turn){

                if (turn % people.size() == 0){

                    lastMan = people.size() - 1;

                }else {

                    lastMan = turn % people.size() - 1;
                }
                allOneCoin = true;

            } else {

                lastMan = turn - 1;

            }

/*
*сначала отрабатываем условие, когда один проход меньше чем всего количество людей
 */
            if (!allOneCoin) {
                for (int j = 0; j <= lastMan; j++) {

                    coins.addOne(j);
                }

                for (int k = lastMan+1; k < people.size(); k++) {

                    coins.addTwo(k);
                }
            } else {

                for (int p = 0; p < people.size(); p++) {

                    coins.addOne(p);

                }
            }

            killer.remove(lastMan);//убираем последнего в проходе и отдаем его деньги следующему

        }

        System.out.println("Номер счастливчика: "+people.get(0).getIndex()+"\nУнес монет: "+people.get(0).getCoins());


    }


}
