package backend.auction;

import backend.board.PropertySquare;
import backend.game.GameManager;
import backend.players.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuctionTest {
    Auction auction;
    GameManager gameManager;

    @BeforeEach
    void setUp() {
        gameManager = new GameManager(new String[]{"p1","p2","p2"});
        PropertySquare prop = (PropertySquare) gameManager.getBoard().getSquares()[1];
        Player[] players = new Player[]{
                gameManager.getBoard().getPlayer(0),
                gameManager.getBoard().getPlayer(1),
                gameManager.getBoard().getPlayer(2)
        };
        auction = new Auction(prop, players);
    }

    @Test
    void settle() {
        auction.settle();
    }
}