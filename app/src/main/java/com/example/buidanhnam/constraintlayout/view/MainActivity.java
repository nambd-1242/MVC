package com.example.buidanhnam.constraintlayout.view;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.buidanhnam.constraintlayout.R;
import com.example.buidanhnam.constraintlayout.adapter.musicAdapter;
import com.example.buidanhnam.constraintlayout.model.Music;
import com.example.buidanhnam.constraintlayout.presenter.presenterImpl;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ViewMain, AdapterView.OnItemClickListener {
    public static final String MUSIC = "music";
    private ListView lvMusic;
    private musicAdapter musicAdapter;
    private ArrayList<Music> musics;
    private presenterImpl presenter;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new presenterImpl(this);
        loadData();
        initView();
    }

    private void loadData() {
        presenter.loadData();
    }

    private void initView() {
        lvMusic = (ListView) findViewById(R.id.lv_music);
        musicAdapter = new musicAdapter(this, R.layout.item_list_view, musics);
        lvMusic.setAdapter(musicAdapter);
        lvMusic.setOnItemClickListener(this);
    }
    @Override
    public void setDataMusic(ArrayList<Music> dataMusic) {
        musics = dataMusic;
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        final Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(MUSIC, musics.get(position));
        startActivity(intent );
    }
}
