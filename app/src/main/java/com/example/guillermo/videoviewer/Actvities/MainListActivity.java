package com.example.guillermo.videoviewer.Actvities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.guillermo.videoviewer.Actvities.Adapters.MainListAdapter;
import com.example.guillermo.videoviewer.R;

public class MainListActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    final String[] datos =
            new String[]{"Elem1","Elem2","Elem3","Elem4","Elem5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        final MainListAdapter adaptador = new MainListAdapter(datos);

        mRecyclerView.setAdapter(adaptador);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

    }

}
