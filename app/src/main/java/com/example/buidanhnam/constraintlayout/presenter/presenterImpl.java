package com.example.buidanhnam.constraintlayout.presenter;

import com.example.buidanhnam.constraintlayout.model.DAOMusic;
import com.example.buidanhnam.constraintlayout.model.Music;
import com.example.buidanhnam.constraintlayout.view.ViewMain;

import java.util.ArrayList;

/**
 * Created by Bui Danh Nam on 20/12/2017.
 */

public class presenterImpl implements presenter {
    private DAOMusic daoMusic;
    private ViewMain viewMain;

    public presenterImpl(ViewMain viewMain) {
        this.viewMain = viewMain ;
        daoMusic = new DAOMusic();
    }

    @Override
    public void loadData() {
        ArrayList<Music> musics = daoMusic.getAllData();
        viewMain.setDataMusic(musics);
    }
    // tuonng tac voi model here
}
