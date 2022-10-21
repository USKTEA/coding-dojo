package tests;

import models.Letter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTest {

    @Test
    void equality() {
        Letter upperA = new Letter("A");
        Letter otherUpperA = new Letter("A");

        assertEquals(upperA, otherUpperA);
    }

    @Test
    void isBlank() {
        Letter blank = new Letter(" ");

        assertEquals(blank.isBlank(), true);
    }

    @Test
    void push() {
        Letter lowerA = new Letter("a");

        assertEquals(new Letter("b"), lowerA.push(1));
    }

    @Test
    void pushLowerZ() {
        Letter lowerZ = new Letter("z");

        assertEquals(new Letter("a"), lowerZ.push(1));
    }

    @Test
    void pushBlank() {
        Letter blank = new Letter(" ");

        assertEquals(new Letter(" "), blank.push(1));
    }

    @Test
    void pushUpperZ() {
        Letter upperZ = new Letter("Z");

        assertEquals(new Letter("A"), upperZ.push(1));
    }
}
