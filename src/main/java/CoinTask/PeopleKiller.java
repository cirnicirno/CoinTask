package CoinTask;

public class PeopleKiller {

    private int nextMan;

    public PeopleKiller(){

    }

   public void remove (int lastMan){


       if (lastMan == Ring.people.size()-1){

           nextMan = 0;

       }else{
           nextMan = lastMan + 1;
       }


       People reMan = new People();
       reMan.setIndex(Ring.people.get(nextMan).getIndex());
       reMan.setCoins(Ring.people.get(nextMan).getCoins() + Ring.people.get(lastMan).getCoins());
       Ring.people.set(nextMan, reMan);

       Ring.people.remove(lastMan);
   }



}
