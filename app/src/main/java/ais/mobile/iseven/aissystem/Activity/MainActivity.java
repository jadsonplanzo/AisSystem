package ais.mobile.iseven.aissystem.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import ais.mobile.iseven.aissystem.R;
import ais.mobile.iseven.aissystem.Util.AboutDialog;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.ais);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Envie um email pra escola.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

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
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_settings){
            AboutDialog.showAbout(getSupportFragmentManager());
            return true;
        }
        return super.onOptionsItemSelected(item);



    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent TrocaTela = new Intent(MainActivity.this, MainActivity.class);
            startActivity(TrocaTela);

        } else if (id == R.id.nav_gallery) {
            Intent TrocaTela = new Intent(MainActivity.this, Tela_Frequencia.class);
            startActivity(TrocaTela);

        } else if (id == R.id.nav_slideshow) {
            Intent TrocaTela = new Intent(MainActivity.this, Tela_Boletim.class);
            startActivity(TrocaTela);

        } else if (id == R.id.nav_manage) {
            Intent TrocaTela = new Intent(MainActivity.this, Tela_Avisos.class);
            startActivity(TrocaTela);

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {
            Intent TrocaTela = new Intent(MainActivity.this, Tela_Login.class);
            startActivity(TrocaTela);

        } else if (id == R.id.nav_eventos) {
        Intent TrocaTela = new Intent(MainActivity.this, Eventos.class);
        startActivity(TrocaTela);

    }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void Frequencia(View view){
        Intent TrocaTela = new Intent(MainActivity.this, Tela_Frequencia.class);
        startActivity(TrocaTela);

    }
    public void Boletim (View view){
        Intent TrocaTela = new Intent(MainActivity.this, Tela_Boletim.class);
        startActivity(TrocaTela);

    }
    public void Avisos (View view){
        Intent TrocaTela = new Intent(MainActivity.this, Tela_Avisos.class);
        startActivity(TrocaTela);

    }
    public void Eventos (View view){
        Intent TrocaTela = new Intent(MainActivity.this, Eventos.class);
        startActivity(TrocaTela);

    }

    public static class Eventos extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_eventos);
        }
    }
}
