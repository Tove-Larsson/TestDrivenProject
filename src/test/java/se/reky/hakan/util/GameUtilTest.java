package se.reky.hakan.util;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import se.reky.hakan.GameException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class GameUtilTest {

    static GameUtil gameUtil;

    @BeforeAll
    public static void createGameUtil() {
        gameUtil = new GameUtil();
    }

    @Test
    public void testToLowerCaseButFirstLetterCapitalized() {
        assertThrows(GameException.class, () -> {
            gameUtil.toLowerCaseButFirstLetterCapitalized(null);

        });

    }
}