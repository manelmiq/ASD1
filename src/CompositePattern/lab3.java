package CompositePattern;

public class lab3 {
    static public void main(String[] args) {
        Cabinet cab = new Cabinet();
        Board board = new Board();

        Drive d1 = new Drive();
        Drive d2 = new Drive();
        Drive d3 = new Drive();
        Bus bus = new Bus();

        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();

        cab.setBoard(board);
        cab.add(d1);
        cab.add(d1);
        cab.add(d1);

        board.setBus(bus);
        board.add(card1);
        board.add(card2);
        board.add(card3);

        System.out.println("Total price of computer is: " + cab.computePrice());
    }
}
