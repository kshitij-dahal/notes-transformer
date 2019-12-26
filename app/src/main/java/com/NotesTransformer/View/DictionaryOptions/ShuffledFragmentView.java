package com.NotesTransformer.View.DictionaryOptions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.NotesTransformer.Controller.DictionaryOptions.ShuffledFragmentController;
import com.example.notestransformer.R;

public class ShuffledFragmentView extends Fragment {

  private ShuffledFragmentController controller;

  public View onCreateView(@NonNull LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
    View root = inflater.inflate(R.layout.fragment_shuffled, container, false);

    controller = new ShuffledFragmentController(root);

    return root;
  }
}