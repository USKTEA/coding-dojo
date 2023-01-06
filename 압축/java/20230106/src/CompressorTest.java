import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompressorTest {

    @Test
    void zipOneCharacter() {
        Compressor compressor = new Compressor();
        int[] stream = compressor.zip("K");

        assertArrayEquals(new int[] {11}, stream);
    }

    @Test
    void zipTwoCharacters() {
        Compressor compressor = new Compressor();
        int[] stream = compressor.zip("KA");

        assertArrayEquals(new int[] {11, 1}, stream);
    }

    @Test
    void zipFiveCharacters() {
        Compressor compressor = new Compressor();
        int[] stream = compressor.zip("KAKAO");

        assertArrayEquals(new int[] {11, 1, 27, 15}, stream);
    }

    @Test
    void zipManyCharacters() {
        Compressor compressor = new Compressor();
        int[] stream = compressor.zip("TOBEORNOTTOBEORTOBEORNOT");

        assertArrayEquals(new int[] {20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34}, stream);
    }
}
