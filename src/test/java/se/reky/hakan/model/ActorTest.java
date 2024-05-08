package se.reky.hakan.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {

    private Actor player;
    private Actor goblin;


    @BeforeEach
    public void createActors() {
        player = new Player("Aldina",15, 7);
        goblin = new Goblin("Snort", 15, 7);
    }

    @Test
    public void testAttackMethod(){
        goblin.attack(player);
        assertEquals(8, player.getHp());
    }



}