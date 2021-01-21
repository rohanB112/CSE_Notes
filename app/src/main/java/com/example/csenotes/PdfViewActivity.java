package com.example.csenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.github.barteksc.pdfviewer.PDFView;
import com.krishna.fileloader.FileLoader;
import com.krishna.fileloader.listener.FileRequestListener;
import com.krishna.fileloader.pojo.FileResponse;
import com.krishna.fileloader.request.FileLoadRequest;

import java.io.File;

public class PdfViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);

        final PDFView pdfView = findViewById(R.id.pdfView);

//        String url = "https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh1-Variables_and_Datatypes.pdf?alt=media&token=8d524d8a-66cb-466e-b010-1cac6d639455";

        String url = getIntent().getStringExtra("pdfUrl");


//        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh1-Variables_and_Datatypes.pdf?alt=media&token=8d524d8a-66cb-466e-b010-1cac6d639455"));
//        startActivity(browserIntent);

        FileLoader.with(this)
                .load(String.valueOf(Uri.parse(url)),false) //2nd parameter is optioal, pass true to force load from network
                .fromDirectory("test4", FileLoader.DIR_INTERNAL)
                .asFile(new FileRequestListener<File>() {
                    @Override
                    public void onLoad(FileLoadRequest request, FileResponse<File> response) {
                        File url = response.getBody();
                        // do something with the file
                        pdfView.fromFile(url).enableSwipe(true)
                                .swipeHorizontal(true)
                                .enableDoubletap(true)
                                .load();                   }

                    @Override
                    public void onError(FileLoadRequest request, Throwable t) {
                    }
                });
    }
}