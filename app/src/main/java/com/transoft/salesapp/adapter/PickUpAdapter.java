package com.transoft.salesapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.transoft.salesapp.R;
import com.transoft.salesapp.model.PickUp;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class PickUpAdapter extends RecyclerView.Adapter<PickUpAdapter.ItemHolder> {

    private List<PickUp> data;
    private PickUpAdapter.OnItemCardClickListener clickListener;

    @Inject
    public PickUpAdapter(OnItemCardClickListener clickListener){
        this.clickListener = clickListener;
        data = new ArrayList<>();
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        return new ItemHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.pick_up_card, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final ItemHolder holder, int position) {
        final PickUp pickUp =  data.get(position);
        holder.pickUpName.setText(pickUp.getName());
        holder.pickUpAddress.setText(pickUp.getAddress());
        holder.pickUpAmount.setText(String.valueOf(pickUp.getAmount()));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ItemHolder extends RecyclerView.ViewHolder {

        private TextView pickUpName, pickUpAddress, pickUpAmount;

        ItemHolder(@NonNull View itemView) {
            super(itemView);
            pickUpName = itemView.findViewById(R.id.pick_up_name);
            pickUpAddress = itemView.findViewById(R.id.pick_up_address);
            pickUpAmount = itemView.findViewById(R.id.pick_up_amount);
            LinearLayout linearLayout = itemView.findViewById(R.id.item_pick_up_card);
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickListener.onPickUpClickListener(data.get(getAdapterPosition()));
                }
            });
        }
    }

    public interface OnItemCardClickListener {
        void onPickUpClickListener(PickUp pickUp);
    }

    public void setData(List<PickUp> data) {
        this.data.addAll(data);
        notifyDataSetChanged();
    }
}
