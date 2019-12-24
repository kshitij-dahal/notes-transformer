package com.NotesTransformer.Model;

import java.util.ArrayList;

public class TermExplanationCollection implements Collection {

  private ArrayList<TermExplanation> termExplanations;
  private static final int MAX_NUM_OF_TERM_EXPLANATIONS = 10;

  public TermExplanationCollection() {
    termExplanations = new ArrayList<>();
  }

  public void addItem(Object value) {
    if (termExplanations.size() < MAX_NUM_OF_TERM_EXPLANATIONS && value != null) {
      TermExplanation termExplanation = (TermExplanation) value;
      termExplanations.add(termExplanation);
    }
  }

  public void removeItem(int removalIndex) {
    if (removalIndex < termExplanations.size() && removalIndex >= 0) {
      termExplanations.remove(removalIndex);
    }
  }

  public void updateItem(int updateIndex, Object newValue) {
    if (updateIndex < termExplanations.size() && updateIndex >= 0 && newValue != null) {
      TermExplanation termExplanation = (TermExplanation) newValue;
      termExplanations.set(updateIndex, termExplanation);
    }
  }

  public Iterator createIterator() {
    return new TermExplanationIterator(termExplanations);
  }
}
