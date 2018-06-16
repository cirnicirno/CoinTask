package CoinTask;

public class PeopleKiller {

    private int nextMan;

    public PeopleKiller(){

    }

   public void remove (int lastMan){


       if (lastMan == GameEmulator.people.size()-1){

           nextMan = 0;

       }else{
           nextMan = lastMan + 1;
       }
       GameEmulator.people.get(nextMan).setCoins(GameEmulator.people.get(nextMan).getCoins()+GameEmulator.people.get(lastMan).getCoins());
       GameEmulator.people.remove(lastMan);

   }



}
