package com.example.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PdfActivity extends AppCompatActivity {

    ImageView imageView;
    TextView ch_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        imageView = findViewById(R.id.pdfActivityImg);
        ch_name = findViewById(R.id.ch_name);

        String chName = getIntent().getStringExtra("ch_name");
        ch_name.setText(chName);
        String url = getIntent().getStringExtra("url");

    }

    public void openPdf(View view) {
        Intent intent = new Intent(PdfActivity.this,PdfViewActivity.class);
        String url = getIntent().getStringExtra("url");
        intent.putExtra("pdfUrl", url);
        startActivity(intent);
    }


}