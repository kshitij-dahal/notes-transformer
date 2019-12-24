package com.NotesTransformer.Model;

import java.util.ArrayList;

public class TermExplanationIterator implements Iterator {

  private ArrayList<TermExplanation> termExplanations;
  private int pos;

  public TermExplanationIterator(ArrayList<TermExplanation> termExplanations) {
    this.termExplanations = termExplanations;
    pos = 0;
  }

  public boolean hasNext() {
    if (pos < termExplanations.size()) {
      return true;
    }
    return false;
  }

  public Object next() {
    TermExplanation termExplanation = termExplanations.get(pos);
    pos++;
    return termExplanation;
  }
}
