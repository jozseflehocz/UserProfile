package com.example.jlehocz.userprofile;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView picture = (ImageView) findViewById(R.id.profile_picture);
        picture.setImageResource(R.drawable.gardonyigeza);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(R.string.name);
        /** Set your profile name size*/
        name.setTextSize(30);
        /** Set your profile name color*/
        name.setTextColor(Color.BLUE);

        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText(R.string.birthday);

        TextView school = (TextView) findViewById(R.id.country);
        school.setText(R.string.country);
    }
}
