package com.it.JD01.chapter4.tasksA.Text;

import java.util.ArrayList;
import java.util.Arrays;

public class Sentence extends Word{
    private ArrayList<Word> words;

    public Sentence() {
        words.add(new Word(""));
    }

    public Sentence(ArrayList<Word> words) {
        this.words = words;
    }

    public ArrayList<Word> getWords() {
        return words;
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Sentence sentence = (Sentence) o;

        return words != null ? words.equals(sentence.words) : sentence.words == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (words != null ? words.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + words +
                "} " + super.toString();
    }
}
