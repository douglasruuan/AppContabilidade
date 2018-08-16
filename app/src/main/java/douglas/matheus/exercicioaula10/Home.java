package douglas.matheus.exercicioaula10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import douglas.matheus.exercicioaula10.model.Pessoa;

public class Home extends AppCompatActivity {

    private Button btCadastro;
    private Button btLigacao;
    private Button btEmp;
    private Button btServicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btCadastro = findViewById(R.id.hm_bt_cadastro);
        btLigacao = findViewById(R.id.hm_bt_ligacao);
        btEmp = findViewById(R.id.hm_bt_empresa);
        btServicos = findViewById(R.id.hm_bt_servicos);

        if(getIntent().getSerializableExtra("p") != null) {

            Pessoa p = (Pessoa) getIntent().getSerializableExtra("p");

            Toast.makeText(getBaseContext(),
                    "Olá " + p.getLogin() +", Bem-vindo, Tois", Toast.LENGTH_LONG).show();
        }//fecha if

        btCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this, Cadastro.class);
                startActivity(it);
            }
        });

        btLigacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this, Ligar.class);
                startActivity(it);
            }
        });
        btEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this, Empresa.class);
                startActivity(it);
            }
        });
        btServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this,Servicos.class);
                startActivity(it);
            }
        });
    }

}
