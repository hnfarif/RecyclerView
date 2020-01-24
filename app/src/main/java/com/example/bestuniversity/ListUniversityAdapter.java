package com.example.bestuniversity;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class ListUniversityAdapter  extends RecyclerView.Adapter<ListUniversityAdapter.ListViewHolder>{

    private ArrayList<University> listUniversity;
    public ListUniversityAdapter(ArrayList<University> list) {
        this.listUniversity = list;
    }

    @NonNull
    @Override
    public ListUniversityAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_university, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListUniversityAdapter.ListViewHolder holder, final int position) {

        final University university = listUniversity.get(position);
        Glide.with(holder.itemView.getContext())
                .load(university.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(university.getName());
        holder.tvDetail.setText(university.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listUniversity.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(holder.itemView.getContext(), UniversityActivity.class);
                intent.putExtra("foto",university.getPhoto());
                intent.putExtra(UniversityActivity.nama, university.getName());
                intent.putExtra(UniversityActivity.detail,university.getDetail());
                holder.itemView.getContext().startActivity(intent);




            }
        });

    }

    @Override
    public int getItemCount() {
        return listUniversity.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvDetail;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
