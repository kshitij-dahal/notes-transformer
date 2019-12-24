package com.NotesTransformer.Model;


public interface Collection {

   void addItem(Object value);

   void removeItem(int removalIndex);

   void updateItem(int updateIndex, Object newValue);

   Iterator createIterator();

}
