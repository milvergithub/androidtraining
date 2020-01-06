package com.transoft.salesapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.transoft.salesapp.R;
import com.transoft.salesapp.model.PickUp;

import java.util.ArrayList;
import java.util.List;

public class PickUpAdapter extends RecyclerView.Adapter<PickUpAdapter.ItemHolder> {

    private List<PickUp> pickUps = new ArrayList<>();
    private Context context;
    private final OnPickUpClickListener mListener;
    public PickUpAdapter(Context context){
        this.context = context;

        try {
            this.mListener = ((OnPickUpClickListener) context);
        } catch (ClassCastException e) {
            throw new ClassCastException("Activity must implement OnPickUpClickListener.");
        }

        for (int i = 0; i < 10; i++) {
            PickUp pickUp = new PickUp();
            pickUp.setAmount("10.5");
            pickUp.setName("Demo 1");
            pickUp.setAddress("Quillacollo");
            pickUp.setPhone("75698745");
            pickUps.add(pickUp);
        }
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.pick_up_card, viewGroup, false);
        ItemHolder holder = new ItemHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ItemHolder holder, int position) {
        final PickUp pickUp =  pickUps.get(position);

        holder.mItem = pickUp;

        holder.pickUpName.setText(pickUp.getName());
        holder.pickUpAddress.setText(pickUp.getAddress());
        holder.pickUpAmount.setText(String.valueOf(pickUp.getAmount()));

        holder.lnlFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener  != null)
                    mListener.onPickUpFavoriteClick(pickUp);
            }
        });

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null)
                    mListener.onPickUpClickListener(pickUp);
            }
        });
    }

    public class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView pickUpName, pickUpAddress, pickUpAmount, pickUpDelivery;
        public RelativeLayout lnlFavorite;
        public ImageView icFavorite;
        public final View mView;
        public PickUp mItem;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;
            pickUpName = itemView.findViewById(R.id.pick_up_name);
            pickUpAddress = itemView.findViewById(R.id.pick_up_address);
            pickUpAmount = itemView.findViewById(R.id.pick_up_amount);
            lnlFavorite = itemView.findViewById(R.id.lnl_favorite);

        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context, "Clicked Item", Toast.LENGTH_SHORT).show();
        }
    }

    public interface OnPickUpClickListener {
        void onPickUpClickListener(PickUp pickUp);
        void onPickUpFavoriteClick(PickUp pickUp);
    }

    @Override
    public int getItemCount() {
        return pickUps.size();
    }
}
