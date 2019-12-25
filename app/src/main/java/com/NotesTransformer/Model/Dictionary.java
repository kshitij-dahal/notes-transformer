package com.NotesTransformer.Model;

public class Dictionary {

  private TermExplanationCollection termExplanationCollection;

  public Dictionary(TermExplanationCollection termExplanationCollection){
    this.termExplanationCollection = termExplanationCollection;
  }

  public TermExplanationCollection getContent(){
    return termExplanationCollection;
  }
}
