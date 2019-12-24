package com.NotesTransformer.Model;

public class TermExplanation {

  private Term term;
  private Explanation explanation;

  public TermExplanation(Term term, Explanation explanation){
    this.term = term;
    this.explanation = explanation;
  }

  public Term getTerm(){
    return term;
  }

  public Explanation getExplanation(){
  return explanation;
  }

  public void setTerm(Term term){
    this.term = term;
  }

  public void setExplanation(Explanation explanation){
    this.explanation = explanation;
  }


}
