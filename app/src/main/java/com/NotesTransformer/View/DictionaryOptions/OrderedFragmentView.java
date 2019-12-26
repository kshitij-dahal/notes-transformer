package com.NotesTransformer.View.DictionaryOptions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.NotesTransformer.Controller.DictionaryOptions.OrderedFragmentController;
import com.example.notestransformer.R;

public class OrderedFragmentView extends Fragment {

  private OrderedFragmentController controller;

  public View onCreateView(@NonNull LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
    View root = inflater.inflate(R.layout.fragment_ordered, container, false);

    controller = new OrderedFragmentController(root);

    return root;
  }
}