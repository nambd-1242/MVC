package com.example.buidanhnam.constraintlayout.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.buidanhnam.constraintlayout.R;
import com.example.buidanhnam.constraintlayout.model.Music;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Bui Danh Nam on 19/12/2017.
 */

public class musicAdapter extends ArrayAdapter<Music> {
    private Context context ;
    private int res ;
    private ArrayList<Music> musics ;
    public musicAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Music> objects) {
        super(context, resource, objects);
        this.res = resource ;
        this.context = context ;
        this.musics = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHoder viewHoder ;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(res,parent , false);
                    viewHoder = new ViewHoder();
            viewHoder.img_avata = (CircleImageView) convertView.findViewById(R.id.img_avata);
            viewHoder.tv_name_song = convertView.findViewById(R.id.tv_name_song);
            viewHoder.tv_name_singer = convertView.findViewById(R.id.tv_name_singer);
            convertView.setTag(viewHoder);
        }
        else {
            viewHoder = (ViewHoder) convertView.getTag();
        }
        Music music = musics.get(position);
        Glide.with(context).load(music.getImage()).centerCrop().into(viewHoder.img_avata);
//        viewHoder.img_avata.setImage(music.getImage());
         viewHoder.tv_name_singer.setText(music.getNameSinger());
        viewHoder.tv_name_song.setText(music.getNameSong());
        return convertView;
    }

    class ViewHoder {
        CircleImageView img_avata ;
        TextView tv_name_song ;
        TextView tv_name_singer ;
    }
}
