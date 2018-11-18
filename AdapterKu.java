package id.go.februrian.membuatrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterKu extends RecyclerView.Adapter<AdapterKu.ViewHolder> {

    private Context context;
    private List<KumpulanData> data; // Kumpulan data berasal dari Class KumpulanData.java


    // - Klik Kanan > Generate > Construktor > Pilih Context dan Data


    public AdapterKu(Context context, List<KumpulanData> data) {    // <-- Konstruktor Dari context
        this.context = context;
        this.data = data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {       // <-- Konstruktor Dari data
        TextView judul,isi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            judul = (TextView)itemView.findViewById(R.id.judul);
            isi = (TextView)itemView.findViewById(R.id.isi);

        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.blueprint, parent, false); // <-- blueprint = layout yg sudah si buat
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        KumpulanData i = data.get(position); // Mengambil Posisi Data

        holder.judul.setText(i.getJudul());
        holder.isi.setText(i.getIsi());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


}
