/*
* По кругу стоят n человек. Ведущий посчитал m человек по кругу, начиная с первого.
* При этом каждый из тех, кто участвовал в этом счете получили по одной монете,
* остальные получили по две монеты. Далее человек, на котором остановился счет, отдает
* все свои моенты следующему по счету человеку, а сам выбывает из круга. Процесс продолжается
* с места остановки аналогичным образом до поледнего человека в круге. Определите номер этого
* человека и количество монет, которое оказалось у него в конце игры.
 */

package CoinTask;


public class Starter {

    public static void main (String[] args){

        //сначала иницализируем метода ввода с клавиатуры в консоль
        ConsoleWorker console = new ConsoleWorker();
        console.insert();

    }

}
