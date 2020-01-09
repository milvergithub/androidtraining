package com.transoft.salesapp.ui.pickup.reception;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.transoft.salesapp.R;
import com.transoft.salesapp.adapter.PickUpAdapter;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * create an instance of this fragment.
 */
public class ReceptionFragment extends Fragment {

    private View rootView;
    private RecyclerView recyclerView;

    @Inject
    public PickUpAdapter pickUpAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = (View) inflater.inflate(R.layout.fragment_reception, container, false);
        initialize();
        setupWidgets();
        return rootView;
    }

    private void initialize() {
        recyclerView = (RecyclerView)rootView.findViewById(R.id.recycler_view);
    }

    private void setupWidgets() {
        LinearLayoutManager llmPlace = new LinearLayoutManager((Context) rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(llmPlace);
        recyclerView.setAdapter(pickUpAdapter);
    }

}
