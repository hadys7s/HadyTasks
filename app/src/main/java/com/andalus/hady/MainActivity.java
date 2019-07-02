package com.andalus.hady;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.Recycle1);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        Data[] fake = new Data[]{
                new Data("Youtube",70,R.drawable.youtube),
                new Data("Instagram",60,R.drawable.instagram),
                new Data("Itunes",50,R.drawable.itunes),
                new Data("kik",70,R.drawable.kik),
                new Data("Skype",55,R.drawable.skype),
                new Data("Linkedin",70,R.drawable.linkedin),
                new Data("Messenger",70,R.drawable.messenger),
                new Data("Reddit",70,R.drawable.reddit),
                new Data("Whatsapp",70,R.drawable.whatsapp),
                new Data("Reddit",70,R.drawable.reddit),
                new Data("Youtube",70,R.drawable.youtube),
                new Data("Instagram",60,R.drawable.instagram),
                new Data("Itunes",50,R.drawable.itunes),
                new Data("kik",70,R.drawable.kik),
                new Data("Skype",55,R.drawable.skype),
                new Data("Linkedin",70,R.drawable.linkedin),
                new Data("Messenger",70,R.drawable.messenger),
                new Data("Reddit",70,R.drawable.reddit),
                new Data("Whatsapp",70,R.drawable.whatsapp),
                new Data("Reddit",70,R.drawable.reddit),




        };

        recyclerView.setAdapter(new Adapter(fake));



    }
}
