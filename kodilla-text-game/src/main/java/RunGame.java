import java.util.Random;

public class RunGame {
    public static void main(String[] args) {
        System.out.println("Witam w grze kamien/papier/nozyce");
        System.out.println("Zasady gry: \n 1 - kamien\n 2 - nozye\n 3 - paier\n x - koniec gry\n n - nowa gra" );
        System.out.println("Podaj po ilu wygranych chcesz zakonczyc: ");
        UserDialogs ud = new UserDialogs();
        int gameQuantity = ud.userDialogsInt();
        int score;
        while(gameQuantity>0) {
            Random rd = new Random();
            System.out.println("Wybierz kamien/nozyce/papier : ");
            int player1 = ud.userDialogsInt();
            int player2 = rd.nextInt(3);
            if (player1 > player2) {

            }

        }
    }



}
