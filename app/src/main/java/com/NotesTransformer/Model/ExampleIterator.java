package com.NotesTransformer.Model;

import java.util.ArrayList;

public class ExampleIterator implements Iterator {

  private ArrayList<Example> examples;
  private int pos;

  public ExampleIterator(ArrayList<Example> examples){
    this.examples = examples;
    pos = 0;
  }

  public boolean hasNext() {
    if(pos < examples.size()){
      return true;
    }
    return false;
  }

  @Override
  public Object next() {
    Example example = examples.get(pos);
    pos++;
    return example;
  }
}
