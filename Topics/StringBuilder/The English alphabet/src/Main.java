class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder empty = new StringBuilder();
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            empty.append(letter + " ");
        }
        empty = empty.deleteCharAt(empty.length() - 1);
        return empty;
    }
}