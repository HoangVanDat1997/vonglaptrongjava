package com.codegym.minitest2;

public class ProgrammingBook extends Book {
    public String language;
    public String frameWord;
    String nameBook;

    public ProgrammingBook(int bookCode, String name, int price, String author, String language, String frameWord) {
        super(bookCode, name, price, author);
        this.language = language;
        this.frameWord = frameWord;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFrameWord() {
        return frameWord;
    }

    public void setFrameWord(String frameWord) {
        this.frameWord = frameWord;
    }

}
