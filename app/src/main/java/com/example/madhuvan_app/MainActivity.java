package com.example.madhuvan_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.madhuvan_app.fragments.ContactUs;
import com.example.madhuvan_app.fragments.media_Fragment;
import com.example.madhuvan_app.fragments.service_Fragment;
import com.example.madhuvan_app.fragments.ini_Fragment;
import com.example.madhuvan_app.fragments.MainFragmentTab;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    private TextView appBarTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        appBarTV = findViewById(R.id.appbar_text_view);

        ImageButton menuRight = findViewById(R.id.leftRight);
        menuRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawer.isDrawerOpen(GravityCompat.START)) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    drawer.openDrawer(GravityCompat.START);
                }
            }
        });
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        appBarTV.setText("Home");
        MainFragmentTab fragmentTab = new MainFragmentTab();
        ft.replace(R.id.f_container, fragmentTab);
        ft.commit();



        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        drawer.closeDrawers();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_home) {
            appBarTV.setText("Home");
            MainFragmentTab fragmentTab = new MainFragmentTab();
            ft.replace(R.id.f_container, fragmentTab);
            ft.commit();


        } else if (id == R.id.nav_camera) {
            appBarTV.setText("Initiatives");
            ini_Fragment fragment = new ini_Fragment();
            ft.replace(R.id.f_container, fragment);
            ft.commit();


        } else if (id == R.id.nav_service) {
            appBarTV.setText("Service Activities");
            service_Fragment service = new service_Fragment();
            ft.replace(R.id.f_container, service);
            ft.commit();

        } else if (id == R.id.nav_contact) {
            appBarTV.setText("Contact Us");
            ContactUs contactus = new ContactUs();
            ft.replace(R.id.f_container, contactus);
            ft.commit();
        }
        else if (id == R.id.nav_media) {
            appBarTV.setText("Print Media Coverage");
            media_Fragment media = new media_Fragment();
            ft.replace(R.id.f_container, media);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}

