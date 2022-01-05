package com.example.adaptivelayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adaptivelayout.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initUI();
    }

    private void initUI() {
        binding.buttonBlink.setOnClickListener(v -> blink());
        binding.buttonBounce.setOnClickListener(v -> bounce());
        binding.buttonRotate.setOnClickListener(v -> rotate());
        binding.buttonFadeIn.setOnClickListener(v -> fadeIn());
        binding.buttonFadeOut.setOnClickListener(v -> fadeOut());
        binding.buttonLeftToRight.setOnClickListener(v -> leftToRight());
        binding.buttonRightToLeft.setOnClickListener(v -> rightToLeft());
        binding.buttonZoomIn.setOnClickListener(v -> zoomIn());
        binding.buttonZoomOut.setOnClickListener(v -> zoomOut());
        binding.buttonGoToMotionActivity.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), SecondActivity.class)));
    }

    private void blink() {
        binding.imageView4.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_anim));
    }

    private void bounce() {
        binding.imageView4.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce));
    }

    private void fadeIn() {
        binding.imageView4.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein));
    }

    private void fadeOut() {
        binding.imageView4.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadeout));
    }

    private void leftToRight() {
        binding.imageView4.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.lefttoright));
    }

    private void rightToLeft() {
        binding.imageView4.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.righttoleft));
    }

    private void rotate() {
        binding.imageView4.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate));
    }

    private void zoomIn() {
        binding.imageView4.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomin));
    }

    private void zoomOut() {
        binding.imageView4.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomout));
    }
}