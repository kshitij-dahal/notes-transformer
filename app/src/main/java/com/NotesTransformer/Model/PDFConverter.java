package com.NotesTransformer.Model;

import android.content.Context;
import android.widget.Toast;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.text.PDFTextStripper;
import com.tom_roush.pdfbox.util.PDFBoxResourceLoader;
import java.io.File;
import java.io.IOException;

public class PDFConverter {

  private static Dictionary dictionary = null;
  private static String pdfFilePath = null;

  public static String getPlainText(Context context){
    PDFBoxResourceLoader.init(context);
    String text;
    try {
      //Loading an existing document
      File file = new File(pdfFilePath);
      PDDocument document = PDDocument.load(file);

      //Instantiate PDFTextStripper class
      PDFTextStripper pdfStripper = new PDFStyledTextStripper();
      pdfStripper.setSortByPosition(true);

      //Retrieving text from PDF document
      text = pdfStripper.getText(document);

      //Closing the document
      document.close();
    }catch (IOException e){
    e.printStackTrace();
    System.out.println("This is the path" + pdfFilePath);
      return null;
    }
    return text;
  }

  public static void setPdfFilePath(String filePath){
    pdfFilePath = filePath;
  }




}
