package com.example.buidanhnam.constraintlayout.view;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.buidanhnam.constraintlayout.R;
import com.example.buidanhnam.constraintlayout.model.Music;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {
   private CircleImageView circleImageView ;
    private TextView tvNameSong ;
    private TextView tvNameSinger ;
    private TextView liryic ;
    private ConstraintLayout viewroot ;
    private boolean isViewDetail = false;
    private ConstraintSet constraintSetTemp ;
    private Music music ;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail_music_first);
        initView();
        bindData();
    }

    private void bindData() {
        Intent intent = getIntent();
        music  = (Music) intent.getSerializableExtra(MainActivity.MUSIC);
        // binddata
        tvNameSong.setText(music.getNameSong());
        tvNameSinger.setText(music.getNameSinger());
        liryic.setText(music.getLyrics());
        Glide.with(this).load(music.getImage()).centerCrop().into(circleImageView);
        RotateAnimation an = new RotateAnimation(0f, 360f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        an.setDuration(4000);
        an.setRepeatCount(-1);                // -1 = infinite repeated
        an.setRepeatMode(Animation.REVERSE); // reverses each repeat
        an.setFillAfter(true);
        circleImageView.setAnimation(an);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void initView() {
        viewroot = (ConstraintLayout) findViewById(R.id.view_group);
        circleImageView = (CircleImageView) findViewById(R.id.circleView_avatar);
        tvNameSinger = (TextView) findViewById(R.id.tv_singer);
        tvNameSong = (TextView) findViewById(R.id.tv_song);
        liryic = (TextView) findViewById(R.id.tv_lir);

        final ConstraintSet constraintSetFirst = new ConstraintSet();
        constraintSetFirst.clone(this, R.layout.activity_detail_music_first );
        final ConstraintSet constraintSetSecond = new ConstraintSet();
        constraintSetSecond.clone(this, R.layout.activity_detail_music_second );

        viewroot.setOnClickListener(new View.OnClickListener() {

            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                if(isViewDetail){
                    isViewDetail = false ;
                    constraintSetFirst.applyTo(viewroot);
                }
                else {
                    isViewDetail = true ;
                    constraintSetSecond.applyTo(viewroot);
                }
                Transition transition = new ChangeBounds();
                transition.setDuration(1000);

                TransitionManager.beginDelayedTransition(viewroot , transition);
            }
        });

    }
}
