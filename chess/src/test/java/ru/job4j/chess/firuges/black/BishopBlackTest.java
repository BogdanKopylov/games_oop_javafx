package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest extends TestCase {

    @Test
    public void testPosition() {
    int[] cell1 = new int[] {0, 5};
    BishopBlack bb = new BishopBlack(Cell.A3);
    int[] cell = new int[] {bb.position().getX(), bb.position().getY()};
    assertThat(cell, is(cell1));
    }

    @Test
    public void testWay() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] rsl = bb.way(Cell.G5);
        Cell[] cells = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(rsl, is(cells));
    }

    @Test
    public void testCopy() {
        int[] cell1 = new int[] {0, 5};
        BishopBlack bb = new BishopBlack(Cell.A1);
        bb = (BishopBlack) bb.copy(Cell.A3);
        int[] cell = new int[] {bb.position().getX(), bb.position().getY()};
        assertThat(cell, is(cell1));
    }

    public void testIsDiagonal() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        boolean check = bb.isDiagonal(bb.position(), Cell.G5);
        assertThat(check, is(true));
    }
}