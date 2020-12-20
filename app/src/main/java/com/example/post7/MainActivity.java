package com.example.post7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adapter adapter = new Adapter(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }

    public void openBrowser(View view) {
        String browserUrl = "https://tif.uad.ac.id/";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(browserUrl)));
    }
    public void openMap(View view) {
        String mapUrl = "https://www.google.com/maps/place/Universitas+Ahmad+Dahlan+-+Kampus+4/@-7.8332349,110.3831212,15z/data=!4m5!3m4!1s0x0:0x173dbeeddc56d9e!8m2!3d-7.8332349!4d110.3831212";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(mapUrl)));
    }
    public void openInstagram(View view) {
        String instagramUrl = "https://www.instagram.com/proditifuad/";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(instagramUrl)));
    }
    public void openYoutube(View view) {
        String youtubeUrl = "https://www.youtube.com/channel/UCoE-ydbWBsV0OU-OXpocQIA";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(youtubeUrl)));
    }
}