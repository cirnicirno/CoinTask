package CoinTask;

public class Coins {

    public Coins(){

    }

    public void addOne(int index){

        People reManOne = new People();
        reManOne.setIndex(Ring.people.get(index).getIndex());
        reManOne.setCoins(Ring.people.get(index).getCoins() + 1);
        Ring.people.set(index, reManOne);

    }
    public void addTwo(int index){

        People reManOne = new People();
        reManOne.setIndex(Ring.people.get(index).getIndex());
        reManOne.setCoins(Ring.people.get(index).getCoins() + 2);
        Ring.people.set(index, reManOne);

    }



}
