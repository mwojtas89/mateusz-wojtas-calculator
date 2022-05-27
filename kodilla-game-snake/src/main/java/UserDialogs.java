import java.util.Scanner;

public class UserDialogs {
    public static Direction getNewDirection(Direction direction) {
        System.out.println("Select direction: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toUpperCase();
        switch (s) {
            case "W" : return Direction.UP;
            case "S" : return Direction.DOWN;
            case "A" : return Direction.LEFT;
            case "D" : return Direction.RIGHT;
            default: return direction;

        }
    }
}
