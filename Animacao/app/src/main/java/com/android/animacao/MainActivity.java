package com.android.animacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
               /* ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat
                        .makeCustomAnimation(getApplicationContext(),R.anim.fade_in,R.anim.mover_direita);
                ActivityCompat.startActivity(MainActivity.this,intent,activityOptionsCompat.toBundle());*/
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.mover_direita);
            }
        });
    }
}