package com.it.JD01.chapter4.tasksA.Text;

import java.util.ArrayList;

public class Text {
    private ArrayList<Sentence> sentences;

    public Text() {
       sentences.add(new Sentence());
    }

    public Text(ArrayList<Sentence> sentences) {
        this.sentences = sentences;
    }

    public ArrayList<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(ArrayList<Sentence> sentences) {
        this.sentences = sentences;
    }
    public void addText(String newText){
        ArrayList<Sentence> newSent= new ArrayList<Sentence>();
        newSent.add(new Sentence(new Word()));
        sentences.add(new Sentence());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Text text = (Text) o;

        return sentences != null ? sentences.equals(text.sentences) : text.sentences == null;
    }

    @Override
    public int hashCode() {
        return sentences != null ? sentences.hashCode() : 0;
    }

    @Override
    public String
    toString() {
        return "Text{" +
                "sentences=" + sentences +
                '}';
    }
}
