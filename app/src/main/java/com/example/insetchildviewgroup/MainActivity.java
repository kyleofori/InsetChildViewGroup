package com.example.insetchildviewgroup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;

import com.github.stkent.insetchildviewgroup.InsetChildViewGroup;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private InsetChildViewGroup insetChildViewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insetChildViewGroup = (InsetChildViewGroup) findViewById(R.id.inset_child_view_group);

        final SeekBar seekBar = (SeekBar) findViewById(R.id.seek_bar);
        seekBar.setOnSeekBarChangeListener(this);
        seekBar.setProgress(9);
    }

    @Override
    public void onProgressChanged(final SeekBar seekBar, final int progress, final boolean fromUser) {
        insetChildViewGroup.setChildViewAspectRatio(computeAspectRatioFromProgress(progress));
    }

    @Override
    public void onStartTrackingTouch(final SeekBar seekBar) {
        // This method intentionally left blank
    }

    @Override
    public void onStopTrackingTouch(final SeekBar seekBar) {
        // This method intentionally left blank
    }

    private float computeAspectRatioFromProgress(final int progress) {
        return (progress + 1) / 10f;
    }

}
