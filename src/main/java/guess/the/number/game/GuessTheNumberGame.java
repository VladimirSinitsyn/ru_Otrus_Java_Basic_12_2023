/*package guess.the.number.game;

    import java.util.Scanner;
//
//public class GuessTheNumberGame {

    //public static void main(String[] args) {
        //guessTheNumberGame();

    }

    //public static void guessTheNumberGame() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру Угадай Число!");
        int ainumber = (int) (Math.random() * maxnumber) + 1;
        System.out.println("Подсказка:"+ainumber);
        while (true) {
            int answer;
            do{
                System.out.println("Введите число от 1 до "+ maxnumber);
                answer = scanner.nextInt(maxnumber);

            }while (answer<1 || answer>5);
            if (answer == ainumber){
                System.out.println("Вы победили");
                break;

            }else
                System.out.println("Вы проиграли");


        }

    }

    public static void Difficulty() {
        int maxnumber;
        char ChooseDifficulty;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите уровень сложности: 1- легко, 2- средний, 3- тяжелый");
        ChooseDifficulty = scanner.next().charAt();

        if ()

    }
}
*/