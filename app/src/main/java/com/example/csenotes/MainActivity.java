package com.example.csenotes;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.Fragments.FragmentDownloads;
import com.example.Fragments.FragmentSettings;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TextView textView1;

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        textView1 = findViewById(R.id.text_java);







        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_downloads, R.id.nav_settings)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }



    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    // Exit app alert dialog
    @Override
    public void onBackPressed() {
        exitAppDialog();
    }

    private void exitAppDialog() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("Exit App?")
                .setMessage("Click on yes to exit this app.")
                .setIcon(R.drawable.ic_warning)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).show();
    }



    // Onclick methods of cards
    public void ch1(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Variables & Datatypes");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh1-Variables_and_Datatypes.pdf?alt=media&token=8d524d8a-66cb-466e-b010-1cac6d639455");
        startActivity(intent);
    }
    public void ch2(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Operators & Expression");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh2-Operators_and_Expression.pdf?alt=media&token=6ea56af5-9ebe-4d60-af86-c1e36100576d");
        startActivity(intent);
    }
    public void ch3(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Strings");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh3-Strings.pdf?alt=media&token=4b3fb6ff-1f26-477f-a6f3-5e066d9599d7");
        startActivity(intent);
    }
    public void ch4(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Conditionals in java");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2Fch4-conditional.pdf?alt=media&token=b03851ea-86e4-4a95-9dcd-4cd40c634ca1");
        startActivity(intent);
    }
    public void ch5(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Loops");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh5-Loop.pdf?alt=media&token=d9a711de-4d51-4638-801c-0bbbb0d34d68");
        startActivity(intent);
    }
    public void ch6(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Arrays");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh-6_Arrays.pdf?alt=media&token=367ee039-c718-4aab-a227-8469ba5f9b0d");
        startActivity(intent);
    }
    public void ch7(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Methods");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh7-Methods.pdf?alt=media&token=738c02f9-c22e-4c34-93a8-50e232d6575e");
        startActivity(intent);
    }
    public void ch8(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","OOPs");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh8-OOPs.pdf?alt=media&token=12b788f7-931a-4107-b0f7-bcc4604fdbaa");
        startActivity(intent);
    }
    public void ch9(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Access Modifiers & Constructors");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh9-Access_Modifiers_And_Constructors.pdf?alt=media&token=4fa4b163-c87e-4691-a8d9-9d06fe0f8970");
        startActivity(intent);
    }
    public void ch10(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Inheritance");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh10_Inheritance.pdf?alt=media&token=7a2a348b-b9b0-4941-96b9-d399f468b49f");
        startActivity(intent);
    }
    public void ch11(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Abstract Classes");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh11-Abstract_Classes.pdf?alt=media&token=c85ee95e-7ba6-4ec3-8bb5-b56aefa75f86");
        startActivity(intent);
    }
    public void ch12(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Packages");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh12-Packages.pdf?alt=media&token=944f9cbb-5ec1-4270-b88b-3fd40c083b23");
        startActivity(intent);
    }
    public void ch13(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Multithreading");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh13-Multithreading.pdf?alt=media&token=d04408fa-7909-42b6-b6af-8b0ef94077fe");
        startActivity(intent);
    }
    public void ch14(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Errors and Exceptions");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FCh14-Errors_And_Exceptions.pdf?alt=media&token=faf7459c-d62f-4cb6-bd13-0f0b071c05aa");
        startActivity(intent);
    }
    //practice set onclick
    public void prac1(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Ch-1 Practice Set");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FPractice%20Set%2FCh1PracticeSet.pdf?alt=media&token=0f7e2077-3bc8-4497-8023-47ecd977b84b");
        startActivity(intent);
    }
    public void prac2(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Ch-2 Practice Set");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FPractice%20Set%2FCh2_Practice.pdf?alt=media&token=d62d971e-36ea-4826-b975-e1be52839875");
        startActivity(intent);
    }
    public void prac3(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Ch-3 Practice Set");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FPractice%20Set%2FCh_3Practice.pdf?alt=media&token=a77b8897-d8ff-4843-b7c4-5dd0adb7a279");
        startActivity(intent);
    }
    public void prac4(View view) {
        Intent intent = new Intent(MainActivity.this,PdfActivity.class);
        intent.putExtra("ch_name","Ch-4 Practice Set");
        intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/pdf-app-ae346.appspot.com/o/Uploads%2FPractice%20Set%2Fch4practiceset.pdf?alt=media&token=212b7fe1-2926-477a-94e5-32f707568d3d");
        startActivity(intent);
    }


    public void darkMode(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
    }

    public void aboutApp(View view) {
        Intent intent = new Intent(MainActivity.this,AboutApp.class);
        startActivity(intent);
    }
}