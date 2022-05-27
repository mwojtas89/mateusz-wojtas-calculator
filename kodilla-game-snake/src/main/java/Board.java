import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    private final static int MAX_ROW = 10;
    private final static int MAX_COL = 10;
    private final static int NEW_APPLE_COUNT = 5;

    private List<GameElements> snake = new ArrayList<>();
    private List<GameElements> apples = new ArrayList<>();
    private int moveCounter = 0;


    public Board() {
        snake.add(new GameElements(3,3));
        snake.add(new GameElements(4,3));
        snake.add(new GameElements(5,3));
    }

    @Override
    public String toString() {
        String s = "|";
        for (int n=0;n<MAX_COL;n++)
            s += "-";
        s += "|\n";
        for (int row =0;row<MAX_ROW;row++)
            s += displayRow(row) + "\n";
        s += "|";
        for (int n=0;n<MAX_COL;n++)
            s += "-";
        s += "|\n";
        return s;
    }

    private String displayRow(int row) {
        String s = "";
        for(int col = 0; col < MAX_COL; col++){
            GameElements element = new GameElements(col,row);
            if(snake.stream().filter(ge -> ge.equals(element)).count() >0)
                s += "*";
            else if (apples.stream().filter(ge -> ge.equals(element)).count() >0)
                s += "o";
            else
                s += " ";
        }
        return s;
    }

    public boolean fail() {
        return false;
    }

    public void makeMove(Direction direction) {
        moveCounter++;
        if (moveCounter >= NEW_APPLE_COUNT) {
            moveCounter =0;
            generateNewApple();
        }
        int col = snake.get(snake.size()-1).getCol();
        int row = snake.get(snake.size()-1).getRow();
        if (direction == Direction.UP)
            row--;
        else if (direction == Direction.DOWN)
            row++;
        else if (direction == Direction.LEFT)
            col--;
        else
            col++;

        GameElements newElement = new GameElements(col,row);
        snake.add(newElement);
        if(apples.stream().filter(ge -> ge.equals(newElement)).count() == 0)
            snake.remove(0);
    }

    private void generateNewApple() {
        Random apple = new Random();
        apples.add(new GameElements(apple.nextInt(10),apple.nextInt(10)));
    }

    public void generateStartApples() {
        Random a = new Random();
        apples.add(new GameElements(a.nextInt(10),a.nextInt(10)));
    }
}
