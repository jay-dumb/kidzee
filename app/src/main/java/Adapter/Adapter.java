package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jay.kidzeee1.R;

import java.util.ArrayList;

import Model.Number;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    private final Context context;
    private final ArrayList<Number> list;
    private Adapter.OnItemClickListener mListener;

    public interface OnItemClickListener{
        void OnClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

    public Adapter(Context context, ArrayList<Number> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_item,parent,false);
        return new Holder(view,mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull final Adapter.Holder holder, int position) {


        Number number = list.get(position);

        holder.textView.setText(String.valueOf(number.getNum()));

        if (number.isCheck()){
            holder.textView.setBackgroundResource(R.color.green);
        }else{
            holder.textView.setBackgroundResource(R.color.colorPrimaryDark);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        TextView textView;

        public Holder(@NonNull View itemView, final OnItemClickListener mListener) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);

            itemView.setOnClickListener(v -> {

                if (mListener != null){
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION){
                        mListener.OnClick(position);
                    }
                }

            });
        }
    }
}


