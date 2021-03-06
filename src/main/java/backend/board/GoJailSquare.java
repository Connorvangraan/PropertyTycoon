package backend.board;

import backend.players.Player;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * The type Go jail square.
 *
 * @author Ashley McManamon
 */
public class GoJailSquare extends Square {
    /**
     * Instantiates a new Square.
     *
     * @param name the name of the square
     */
    public GoJailSquare(String name) {
        super(name);
    }

    /**
     * Sends the player to jail
     *
     * @param player the player
     * @param board  the board
     */
    @Override
    public void doAction(Player player, Board board) {
        LOG.debug("Sending " + player.getName() + " to jail");
        int index = IntStream.range(0, board.getSquares().length)
                .filter(i -> List.of(board.getSquares()).get(i).getName().equals("Go to jail"))
                .findFirst()
                .orElse(-1);

        player.setPosition(index);
    }
}
