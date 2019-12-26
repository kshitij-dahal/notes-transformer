package com.NotesTransformer.Controller.DictionaryOptions;

import android.content.Context;
import android.view.View;

public class GuessFragmentController implements View.OnClickListener{
  private View view;
  private Context appContext;

  public GuessFragmentController(View view) {
    this.view = view;
    appContext = view.getContext();
  }

  @Override
  public void onClick(View v) {

  }
}
