package ru.job4j.chess.firuges.black;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.chess.firuges.*;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenF8ThenF8() {
        BishopBlack bb = new BishopBlack(Cell.F8);
        Cell result = bb.position();
        assertThat(result, is(Cell.F8));
    }

    @Test
    public void whenCopyA3thenA3() {
        BishopBlack bb = new BishopBlack(Cell.F8);
        Figure result = bb.copy(Cell.A3);
        assertThat(result.position(), is(Cell.A3));
    }

    @Test
    public void whenDiagonalC1G5ThenTrue() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        boolean result = bb.isDiagonal(Cell.C1, Cell.G5);
        assertThat(result, is(true));
    }

    @Test
    public void whenWayC1ToG5() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] result = bb.way(Cell.G5);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenWayA8ToH1() {
        BishopBlack bb = new BishopBlack(Cell.A8);
        Cell[] expected = {Cell.B7, Cell.C6, Cell.D5, Cell.E4, Cell.F3, Cell.G2, Cell.H1};
        Cell[] result = bb.way(Cell.H1);
        assertArrayEquals(expected, result);
    }

}