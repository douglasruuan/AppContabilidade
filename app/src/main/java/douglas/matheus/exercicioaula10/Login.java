package douglas.matheus.exercicioaula10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import douglas.matheus.exercicioaula10.model.Pessoa;

public class Login extends AppCompatActivity {

    private EditText etLogin;
    private EditText etPassword;
    private Button btOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       //Refs
       /* etLogin = findViewById(R.id.lg_et_login);
        etPassword = findViewById(R.id.lg_et_password);
        btOK = findViewById(R.id.lg_bt_ok);

        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pessoa p = new Pessoa();

                p.setLogin(etLogin.getText().toString());
                p.setPassword(etPassword.getText().toString());
                if(etLogin.getText().toString().equals("") && etPassword.getText().toString().equals("")){
                    Toast.makeText(getBaseContext(),"Login com sucesso!",Toast.LENGTH_SHORT).show();
                    Intent it = new Intent(Login.this, Home.class);
                    it.putExtra("p", p); //Serializable na classe
                    startActivity(it);

                }else{
                    Toast.makeText(getBaseContext(), "Tente novamente!", Toast.LENGTH_LONG).show();
                }
            }
        });*/
    }//fecha oncreate

    }
