package com.NotesTransformer.Model;

import java.util.Iterator;

public interface Collection {

  public void addItem(Object value);

  public void removeItem(int removalIndex);

  public void updateItem(int updateIndex, Object newValue);

  public Iterator createIterator();

}
