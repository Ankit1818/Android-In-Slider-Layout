package com.example.mobile_zone2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity
{
    SliderLayout sliderLayout;
    HashMap<String,Integer> hashMap;

    GridView gridView;

        String text[]={"MI","oppo","Vivo","semsung","lava","infinity"};
        int image[]={R.drawable.realmi1,R.drawable.oppo2,R.drawable.vivo3,R.drawable.samsung4,R.drawable.lava6,R.drawable.infinity5};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.l1);
        sliderLayout=findViewById(R.id.s1);
        hashMap=new HashMap<>();
        hashMap.put("Note 8-pro",R.drawable.note8pro);
        hashMap.put("Nokia 8.1",R.drawable.nokia8);
        hashMap.put("Samsem",R.drawable.sama50);
        hashMap.put("vivo V9",R.drawable.vivov9);

        for (String name:hashMap.keySet())
        {
            TextSliderView textSliderView = new TextSliderView(MainActivity.this);
            textSliderView
                    .description(name)
                    .image(hashMap.get(name));

            sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
            sliderLayout.addSlider(textSliderView);
            sliderLayout.setDuration(2000);
        }
        BaseAdapter baseAdapter = new BaseAdapter(getApplicationContext(),image,text);
        gridView.setAdapter(baseAdapter);
    }
}
