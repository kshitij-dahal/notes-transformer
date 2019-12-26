package com.NotesTransformer.View;

import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.NotesTransformer.Controller.MainSelectPDFController;
import com.NotesTransformer.Model.PDFConverter;
import com.example.notestransformer.R;



public class MainSelectPDFView extends AppCompatActivity {

  MainSelectPDFController controller;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_select_pdf);

    controller = new MainSelectPDFController(this);

    Button selectPDFBtn = findViewById(R.id.selectPDFBtn);
    Button settingsBtn = findViewById(R.id.settingsBtn);
    Button helpBtn = findViewById(R.id.helpBtn);

    selectPDFBtn.setOnClickListener(controller);
    settingsBtn.setOnClickListener(controller);
    helpBtn.setOnClickListener(controller);

  }

  @Override
  protected void onActivityResult (int requestCode,
      int resultCode,
      Intent data){
    switch (requestCode) {
      case 1:
        if (resultCode == -1) {
          Uri uri = data.getData();
          String pdfSrc = uri.getPath();
          PDFConverter.setPdfFilePath(getFilesDir() + "/" + pdfSrc);
          Toast.makeText(this,pdfSrc,Toast.LENGTH_LONG).show();
          Intent intent = new Intent(this,DictionaryOptionsView.class);
          startActivity(intent);
        }

        break;
    }
  }
}
