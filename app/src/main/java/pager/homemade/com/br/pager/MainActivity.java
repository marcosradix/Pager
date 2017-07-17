package pager.homemade.com.br.pager;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnCadastrar, btnLogar;
    private ImageView imagem;
    private TextView textViewBitFaz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        btnLogar = (Button) findViewById(R.id.btnLogar);
        textViewBitFaz = (TextView) findViewById(R.id.txtBitFaz);
        imagem = (ImageView) findViewById(R.id.imagem);


        btnLogar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.containerLayout , new LogarFragment());
                fragmentTransaction.commit();
                imagem.setVisibility(View.INVISIBLE);
                textViewBitFaz.setVisibility(View.INVISIBLE);


            }
        });

            btnCadastrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.containerLayout , new CadastrarFragment());
                    fragmentTransaction.commit();
                    imagem.setVisibility(View.INVISIBLE);
                    textViewBitFaz.setVisibility(View.INVISIBLE);



                }
            });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id){
            case R.id.action_settings:
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Novo cotato");
                alert.setMessage("Email do usuário");
                alert.setCancelable(false);
                final EditText texto = new EditText(this);
                alert.setView(texto);
                alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Muto bem mobral", Toast.LENGTH_LONG).show();

                    }
                });

                alert.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Isso ai lesado", Toast.LENGTH_LONG).show();
                    }
                });
                alert.create();
                alert.show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
