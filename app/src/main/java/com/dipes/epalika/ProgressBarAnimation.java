package com.dipes.epalika;

import android.content.Context;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressBarAnimation extends Animation {
private Context context;
private ProgressBar progressBar;
private TextView text;
private Float from;
private Float to;

    public ProgressBarAnimation(Context context, ProgressBar progressBar, TextView textView, Float from, Float to) {
        this.context = context;
        this.progressBar = progressBar;
        this.text = textView;
        this.from = from;
        this.to = to;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float value= from + (to - from) * interpolatedTime;
        progressBar.setProgress((int)value);
        text.setText((int)value+"%");

        if (value == to){
            context.startActivity(new Intent(context,SliderActivity.class));
        }
    }
}
