package com.NotesTransformer.Model;


import com.tom_roush.pdfbox.text.PDFTextStripper;
import com.tom_roush.pdfbox.text.TextPosition;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PDFStyledTextStripper extends PDFTextStripper {

  public PDFStyledTextStripper() throws IOException
  {
    super();
  }

  @Override
  protected void writeString(String text, List<TextPosition> textPositions) throws IOException
  {
    for (TextPosition textPosition : textPositions)
    {
      Set<String> style = getStyle(textPosition);
      if (!style.equals(currentStyle))
      {
        output.write(style.toString());
        currentStyle = style;
      }
      output.write(textPosition.toString());
    }
  }

  Set<String> getStyle(TextPosition textPosition)
  {
    Set<String> result = new HashSet<>();

    if (textPosition.getFont().getName().toLowerCase().contains("bold"))
      result.add("Bold");

    if (textPosition.getFont().getName().toLowerCase().contains("italic"))
      result.add("Italic");

    return result;
  }

  Set<String> currentStyle = Collections.singleton("Undefined");
}


