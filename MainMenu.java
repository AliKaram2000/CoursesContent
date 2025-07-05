package com.aeinae.routeassignmenttwo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.aeinae.routeassignmenttwo.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {
    TextView button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);
        button = findViewById(R.id.androidButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(v);
            }
        });

    }

    public void onButtonClick(View v) {

        int id = v.getId();
        if (id == R.id.androidButton) {
            Intent intent = new Intent(this, AndroidCourse.class);
            startActivity(intent);
        }else if(id == R.id.iosButton){
            Intent intent = new Intent(this, IosCourse.class);
            startActivity(intent);
        }else if(id == R.id.FSButton){
            Intent intent = new Intent(this, FullStackCourse.class);
            startActivity(intent);
        }
    }
}
