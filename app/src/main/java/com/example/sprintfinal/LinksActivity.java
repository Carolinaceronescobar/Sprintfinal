package com.example.sprintfinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);

        //inicializaicon de botones
        Button instagramButton = findViewById(R.id.button_instagram);
        Button facebookButton = findViewById(R.id.button_facebook);
        Button linkedinButton = findViewById(R.id.button_linkedin);

        // boton para volver al mainactivity
        Button goLinksButton = findViewById(R.id.button_go_main_activity);

        //configuracion de los botones para redes sociales
        instagramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.instagram.com/hoyempresas");
            }
        });

        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.facebook.com/hoyempresas");
            }
        });

        linkedinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.linkedin.com/company/hoyempresas");
            }
        });
    }

    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}


