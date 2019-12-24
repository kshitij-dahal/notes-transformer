package com.NotesTransformer.Model;

public class Definition extends Explanation {

  private String def;

  public Definition(String def, ExampleCollection examples) {
    super(examples);
    this.def = def;
  }

  public String getDefinition() {
    return def;
  }

  public void setDefinition(String def) {
    this.def = def;
  }

}
