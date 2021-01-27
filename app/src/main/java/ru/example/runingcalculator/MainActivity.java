package ru.example.runingcalculator;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<v> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button run = findViewById(R.id.but_run);
        run.setOnClickListener(v -> {
            Uri uri = Uri.parse(getString(R.string.intent_uri));
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            ActivityInfo ai = intent.resolveActivityInfo(getPackageManager(), intent.getFlags());
            if (ai != null) {
                startActivity(intent);
            }
        });
    }
}