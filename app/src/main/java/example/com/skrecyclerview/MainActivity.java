package example.com.skrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by wahyu on 21/10/16.
 */

public class MainActivity extends AppCompatActivity {

    /** Inisialisasi semua variabel yang diperlukan */
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> datasetJudul;
    private ArrayList<String> datasetDeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buat object dari data dummy yang dibuat
        datasetJudul = new ArrayList<>();
        datasetDeskripsi = new ArrayList<>();

        // panggil data dummy nya.
        dummyDataset();

        //cari object RecyclerViewnya.
        recyclerView = (RecyclerView) findViewById(R.id.main_recycler);
        recyclerView.setHasFixedSize(true);

        //untuk membuat list biasa, gunakan LinearLayoutManager
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        // panggil adapternya
        adapter = new RecyclerAdapter(datasetJudul, datasetDeskripsi);
        recyclerView.setAdapter(adapter);

    }

    /** buat dummy dataset yang akan ditampilkan*/
    private void dummyDataset() {

        // list 0
        datasetJudul.add("Masker Jomblo");
        datasetDeskripsi.add("Khusus Jomblo yang belum punya calon.");

        // list 1
        datasetJudul.add("Helm Jomblo");
        datasetDeskripsi.add("Khusus Jomblo yang inget mantan.");

        // list 2
        datasetJudul.add("Kacamata Jomblo");
        datasetDeskripsi.add("Hanya untuk jomblo keren.");

        // list 3
        datasetJudul.add("Jaket Jomblo");
        datasetDeskripsi.add("Buat jomblo yang malu sama mantan.");

        // list 4
        datasetJudul.add("Muka Jomblo");
        datasetDeskripsi.add("Muka baru, desain khusus 100% cotton.");

        // list 5
        datasetJudul.add("Kulit silikon");
        datasetDeskripsi.add("Buat jomblo yang pengen mulus.");

        // list 6
        datasetJudul.add("Kaos Jomblo");
        datasetDeskripsi.add("Deklarasi sebagai jomblo se-jomblo-jomblonya.");

        // list 7
        datasetJudul.add("Sepatu Jomblo");
        datasetDeskripsi.add("Setiap jalan selalu teringat status jomblo.");

        // list 8
        datasetJudul.add("Pitak Jomblo");
        datasetDeskripsi.add("Buat 1 pitak setiap kali diputusin calon.");

        // list 9
        datasetJudul.add("Jomblo ke 2");
        datasetDeskripsi.add("Jomblo lagi setelah jomblo.");
    }
}
