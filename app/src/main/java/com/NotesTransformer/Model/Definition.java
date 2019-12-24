package com.NotesTransformer.Model;

public class Definition extends Explanation {

  private String def;

  public Definition(int numOfExamples, String def) {
    super(numOfExamples);
    this.def = def;
  }

  public String getDefinition() {
    return def;
  }

  public void setDefinition() {
    this.def = def;
  }

}
