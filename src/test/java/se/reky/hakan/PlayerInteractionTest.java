package se.reky.hakan;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Player;

import java.util.Scanner;

class PlayerInteractionTest {

    private Player player;

    @BeforeEach
    public void createPlayer() {
        player = new Player();
    }

    private PlayerInteraction playerInteraction (String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        IOHandler ioHandler = new IOHandler(scanner);
        return new SimplePlayerInteraction(ioHandler);
    }

    @Test
    public void testSetUpPlayer() {
        PlayerInteraction playerInteraction = playerInteraction("Benny");
        playerInteraction.setupPlayer(player);
        Assertions.assertEquals("Benny", player.getName());
    }

    @Test
    public void testUpdatePlayerHealth() {
        PlayerInteraction playerInteraction = playerInteraction("Frida");
        player.setHp(10);
        playerInteraction.updatePlayerHealth(player, 20);
        Assertions.assertEquals(30, player.getHp());
    }




}