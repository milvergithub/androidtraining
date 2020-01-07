package com.transoft.salesapp.activity.pickup.reception;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.transoft.salesapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * create an instance of this fragment.
 */
public class ReceptionFormFragment extends Fragment {

    private ReceptionFormViewModel receptionFormViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        receptionFormViewModel = ViewModelProviders.of(this).get(ReceptionFormViewModel.class);
        View root = inflater.inflate(R.layout.fragment_form_reception, container,false);
        final TextView textView = root.findViewById(R.id.text_reception);
        receptionFormViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
