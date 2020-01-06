package com.transoft.salesapp.activity.SppActivity.reception;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.transoft.salesapp.R;
import com.transoft.salesapp.adapter.PickUpAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * create an instance of this fragment.
 */
public class ReceptionFragment extends Fragment {

    private RecyclerView mRecyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupWidgets();
        initialize();
    }

    private void initialize() {
        mRecyclerView = (RecyclerView)getView().findViewById(R.id.recycler_view);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_reception, container, false);
    }

    private void setupWidgets() {
        LinearLayoutManager llmPlace = new LinearLayoutManager(getView().getContext(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(llmPlace);
        PickUpAdapter receptionAdapter = new PickUpAdapter(getView().getContext());
        mRecyclerView.setAdapter(receptionAdapter);
    }

}
