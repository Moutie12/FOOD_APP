package com.example.myfood;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.OrderViewHolder> {
    private List<String> user;
    private List<String> name_food;

    public OrdersAdapter(List<String> user, List<String> name_food) {
        this.user = user;
        this.name_food = name_food;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order_item, parent, false);
        return new OrderViewHolder(itemView);
    }

    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        String id = user.get(position);
        String food = name_food.get(position);
        holder.bind(id, food);
    }

    @Override
    public int getItemCount() {
        return user.size();
    }


    public static class OrderViewHolder extends RecyclerView.ViewHolder {
        private FrameLayout container;
        private LinearLayout content;
        private TextView idTextView;
        private TextView foodTextView;

        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setBackgroundColor(Color.parseColor("#FAF7F6"));
            container = itemView.findViewById(R.id.order_item_container);
            content = itemView.findViewById(R.id.order_item_content);
            idTextView = itemView.findViewById(R.id.order_item_id_text_view);
            foodTextView = itemView.findViewById(R.id.order_item_food_text_view);
        }

        public void bind(String id, String food) {
            idTextView.setText("ID Restaurant: " + id);
            foodTextView.setText("Nom Restaurant: " + food);
        }
        public void bind1(String id, String food) {
            idTextView.setText("id du commande : " + id);
            foodTextView.setText("Nom: " + food + "\n" +"Adresse : "+ profil.adresse);
        }
    }

}

