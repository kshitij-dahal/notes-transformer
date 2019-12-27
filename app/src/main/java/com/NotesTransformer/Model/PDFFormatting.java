package com.NotesTransformer.Model;

public class PDFFormatting {

  private PDFFormatting pdfFormatting;
  private String termDefSeparator = null;

  private PDFFormatting() {
  }

  public PDFFormatting getInstance() {
    if (pdfFormatting == null) {
      pdfFormatting = new PDFFormatting();
    }
    return pdfFormatting;
  }

  public String getTermDefSeparator() {
    return termDefSeparator;
  }

  public void setTermDefSeparator() {
    this.termDefSeparator = termDefSeparator;
  }


}
