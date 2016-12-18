package com.star.animationrestest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.scale_btn)
    Button mScaleBtn;

    @Bind(R.id.alpha_btn)
    Button mAlphaBtn;

    @Bind(R.id.rotate_btn)
    Button mRotateBtn;

    @Bind(R.id.translate_btn)
    Button mTranslateBtn;

    @Bind(R.id.txt)
    TextView mTxt;

    @OnClick({R.id.scale_btn, R.id.alpha_btn,
            R.id.rotate_btn, R.id.translate_btn})
    void click(View view){
        switch(view.getId()){
            case R.id.scale_btn:
                mTxt.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_scale));
                break;
            case R.id.alpha_btn:
                mTxt.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_alpha));
                break;
            case R.id.rotate_btn:
                mTxt.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_rotate));
                break;
            case R.id.translate_btn:
                mTxt.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_translate));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
