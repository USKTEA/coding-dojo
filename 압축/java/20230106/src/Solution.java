public class Solution {
    public int[] zip(String msg) {
        Compressor compressor = new Compressor();
        int[] stream = compressor.zip(msg);

        return stream;
    }
}
