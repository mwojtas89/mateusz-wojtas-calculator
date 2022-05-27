public class GameRun {
    public static void main(String[] args) {
        Board board = new Board();
        Direction direction = Direction.RIGHT;
        board.generateStartApples();
        while (!board.fail()){
            System.out.println(board);
            direction = UserDialogs.getNewDirection(direction);
            board.makeMove(direction);

        }
    }
}
