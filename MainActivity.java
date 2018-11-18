package id.go.februrian.membuatrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<KumpulanData> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recview);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<KumpulanData>();
        data.add(new KumpulanData("Judul 1","Isi dari judul 1"));
        data.add(new KumpulanData("Judul 2","Isi dari judul 2"));
        data.add(new KumpulanData("Judul 3","Isi dari judul 3"));
        data.add(new KumpulanData("Judul 4","Isi dari judul 4"));
        data.add(new KumpulanData("Judul 5","Isi dari judul 5"));
        data.add(new KumpulanData("Judul 6","Isi dari judul 6"));
        data.add(new KumpulanData("Judul 7","Isi dari judul 7"));
        data.add(new KumpulanData("Judul 8","Isi dari judul 8"));

        mAdapter = new AdapterKu(this,data);
        recyclerView.setAdapter(mAdapter);

    }
}
