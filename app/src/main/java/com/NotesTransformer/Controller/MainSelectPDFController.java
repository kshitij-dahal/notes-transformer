package com.NotesTransformer.Controller;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.NotesTransformer.View.MainSelectPDFView;
import com.example.notestransformer.R;

public class MainSelectPDFController implements View.OnClickListener {

  private MainSelectPDFView view;
  private Context appContext;
  public static final int PICKFILE_RESULT_CODE = 1;

  public MainSelectPDFController(Context context) {
    appContext = context;
    view = (MainSelectPDFView) appContext;
  }

  @Override
  public void onClick(View v) {
    if (v.getId() == R.id.selectPDFBtn) {
        // show file picker
      Intent chooseFile = new Intent(Intent.ACTION_GET_CONTENT);
      chooseFile.setType("*/*");
      chooseFile = Intent.createChooser(chooseFile, "Choose a file");
      view.startActivityForResult(chooseFile, PICKFILE_RESULT_CODE);

    } else if (v.getId() == R.id.settingsBtn) {

    } else if (v.getId() == R.id.helpBtn) {

    }
  }




}
