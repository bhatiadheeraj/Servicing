package com.servicing;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by bhatia on 15/09/16.
 */
public class AppIntros extends AppIntro {


    @Override
    public void init(Bundle savedInstanceState) {

        addSlide(AppIntroFragment.newInstance("Title 1", "Loooooooooooooooo[...]ooooooooong description here.", R.drawable.ic_slide1, Color.parseColor("#222222")));
        addSlide(AppIntroFragment.newInstance("Title 2", "Loooooooooooooooo[...]ooooooooong description here.", R.drawable.ic_slide2, Color.parseColor("#00BCD4")));
        addSlide(AppIntroFragment.newInstance("Title 3", "Loooooooooooooooo[...]ooooooooong description here.", R.drawable.ic_slide3, Color.parseColor("#5C6BC0")));
        addSlide(AppIntroFragment.newInstance("Title 4", "Loooooooooooooooo[...]ooooooooong description here.", R.drawable.ic_slide4, Color.parseColor("#4CAF50")));
        setFlowAnimation();

    }

    @Override
    public void onSkipPressed() {

    }


    @Override
    public void onNextPressed() {

    }

    @Override
    public void onDonePressed() {



        Intent i = new Intent(AppIntros.this, MainActivity.class);
        startActivity(i);
        finish();

    }

    @Override
    public void onSlideChanged() {

    }
}
