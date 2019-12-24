package com.NotesTransformer.Model;

public class TermList extends Explanation {

  private String list[];
  private int index;


  public TermList(int numOfExamples, int listLength) {
    super(numOfExamples);
    list = new String[listLength];
    index = 0;
  }

  public void addListItem(String listItem){
    if (index < list.length) {
      list[index] = listItem;
      index++;
    }
  }

}
