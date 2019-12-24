package com.NotesTransformer.Model;


import java.util.ArrayList;

public class ExampleCollection implements Collection {

  private ArrayList<Example> examples;
  private static final int MAX_NUM_OF_EXAMPLES = 3;
  private int index;

  public ExampleCollection() {
    examples = new ArrayList<>();
  }

  public void addItem(Object value) {
    if (examples.size() < MAX_NUM_OF_EXAMPLES && value != null) {
      Example example = new Example((String) value);
      examples.add(example);
    }
  }

  public void removeItem(int removalIndex) {
    if (removalIndex < examples.size() && removalIndex >= 0) {
      examples.remove(removalIndex);
    }
  }

  public void updateItem(int updateIndex, Object newValue) {
    if (updateIndex < examples.size() && updateIndex >= 0 && newValue != null) {
      Example example = new Example((String) newValue);
      examples.set(updateIndex, example);
    }
  }

  public Iterator createIterator() {
    return new ExampleIterator(examples);
  }
}
