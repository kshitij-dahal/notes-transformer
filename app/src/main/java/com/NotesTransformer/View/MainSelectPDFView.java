package com.NotesTransformer.View;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.notestransformer.R;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.text.PDFTextStripper;
import com.tom_roush.pdfbox.util.PDFBoxResourceLoader;
import java.io.File;
import java.io.FileWriter;



public class MainSelectPDFView extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_select_pdf);


  }
}
