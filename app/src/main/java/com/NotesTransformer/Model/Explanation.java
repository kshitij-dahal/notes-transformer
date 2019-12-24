package com.NotesTransformer.Model;

public class Explanation {

  private String[] examples;
  private int index;

  public Explanation(int numOfExamples) {
    examples = new String[numOfExamples];
    index = 0;
  }

  public void addExample(String example) {
    if (index < examples.length) {
      examples[index] = example;
      index++;
    }
  }

  public void updateExample(int updateIndex, String example){
    if (updateIndex < examples.length) {
      examples[updateIndex] = example;
    }
  }

  public void deleteExample(int deleteIndex){
    if (deleteIndex < examples.length) {
      examples[deleteIndex] = "";
    }
  }

  public String[] getExamples(){
    return examples;
  }


}
