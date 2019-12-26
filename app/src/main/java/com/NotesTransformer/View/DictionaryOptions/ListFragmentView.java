package com.NotesTransformer.View.DictionaryOptions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.NotesTransformer.Controller.DictionaryOptions.ListFragmentController;
import com.example.notestransformer.R;

public class ListFragmentView extends Fragment {

  private ListFragmentController controller;

  public View onCreateView(@NonNull LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
    View root = inflater.inflate(R.layout.fragment_list, container, false);

    controller = new ListFragmentController(root);

    return root;
  }
}