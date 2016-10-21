package example.com.skrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wahyu on 21/10/16.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<String> daftarJudul;
    private ArrayList<String> daftarDeskripsi;

    /** referensi ke setiap item yang ada di list nya,
     * gampangnya adalah untuk menghubungkan isi list (list_main.xml) nya dengan adapter ini
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtJudul;
        TextView txtDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);

            txtJudul = (TextView) itemView.findViewById(R.id.list_judul);
            txtDeskripsi = (TextView) itemView.findViewById(R.id.list_deskripsi);
        }


    }

    /** Buat konstruktor dengan parameter sesuai dengan Dataset yang akan dimasukkan ke adapter*/
    public RecyclerAdapter(ArrayList<String> daftarJudul, ArrayList<String> daftarDeskripsi) {
        this.daftarJudul = daftarJudul;
        this.daftarDeskripsi = daftarDeskripsi;
    }

    /** buat view barunya disini, sesuai dengan desain di list_main.xml */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_main, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    /** isikan datanya ke masing-masing item di list_main.xml */
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        // isikan datanya sesuai dengan urutan yang ada di variabel daftarJudul.
        holder.txtJudul.setText(daftarJudul.get(position));
        holder.txtDeskripsi.setText(daftarDeskripsi.get(position));

    }

    /** hitung ukuran dataset yang ada di daftarJudul */
    @Override
    public int getItemCount() {
        return daftarJudul.size();
    }

}
