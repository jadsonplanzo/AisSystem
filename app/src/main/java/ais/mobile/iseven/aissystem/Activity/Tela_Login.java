package ais.mobile.iseven.aissystem.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ais.mobile.iseven.aissystem.R;

public class Tela_Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);


    }

    public  void Entrar(View view){
        Intent TrocaTela = new Intent(Tela_Login.this, MainActivity.class);
        startActivity(TrocaTela);
    }
}
