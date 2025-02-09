public class FindIndex {

    private String word;
    private int i;
    private boolean bool;

    FindIndex(String word) {
        this.word = word;
    }

    public int getIndex() {
        for (i = 0; i < word.length(); i++) {
            bool = true;
            for (int j = 0; j < word.length(); j++) {
                if (i != j)
                    if (word.charAt(j) == word.charAt(i)) {
                        bool = false;
                    }

            }
            if (bool)
                return i;

        }
        return -1;
    }

}
