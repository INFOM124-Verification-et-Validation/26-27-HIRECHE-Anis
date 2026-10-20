package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * A very simple (and not particularly useful)
 * test class to have a starting point where to put tests.
 *
 * @author Arie van Deursen
 */

class DirectionTest {

    /**
     * Do we get the correct delta when moving north?
     */
    @Test
    void testNorth() {
        assertThat(Direction.NORTH.getDeltaX()).isEqualTo(0);
        assertThat(Direction.NORTH.getDeltaY()).isEqualTo(-1);

    }

    @Test
    void testSouth() {
        assertThat(Direction.SOUTH.getDeltaX()).isEqualTo(0);
        assertThat(Direction.SOUTH.getDeltaY()).isEqualTo(1);
    }

    @Test
    void testEast() {
        assertThat(Direction.EAST.getDeltaX()).isEqualTo(1);
        assertThat(Direction.EAST.getDeltaY()).isEqualTo(0);
    }

    @Test
    void testWest() {
        assertThat(Direction.WEST.getDeltaX()).isEqualTo(-1);
        assertThat(Direction.WEST.getDeltaY()).isEqualTo(0);
    }
}
