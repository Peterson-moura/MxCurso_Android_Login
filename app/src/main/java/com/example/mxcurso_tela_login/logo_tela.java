package com.example.mxcurso_tela_login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class logo_tela extends Activity {

    private EditText Usuario;
    private EditText Senha;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo_tela);

        this.Usuario = (EditText) findViewById(R.id.editUsuario);
        this.Senha = (EditText) findViewById(R.id.editSenha);
    }

    public void verificaLogon(View v) {
        String PegaUsuario = Usuario.getText().toString();
        String PegaSenha = Senha.getText().toString();


        if (PegaUsuario.equals("teste@teste.com") && PegaSenha.equals("123")) {
            Intent intent = new Intent(this, principal_tela2.class);
            startActivity(intent);
        }

        else {



        }
}
}
