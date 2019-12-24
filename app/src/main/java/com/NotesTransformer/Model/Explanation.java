package com.NotesTransformer.Model;

public class Explanation {

  private ExampleCollection examples;

  public Explanation(ExampleCollection examples) {
    this.examples = examples;
  }

  public ExampleCollection getExamples() {
    return examples;
  }

  public void setExamples(ExampleCollection examples){
    this.examples = examples;
  }


}
