package co.com.etn.myapplicationvistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickFab(View view) {
        // Moverse a otra actividad
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);

        // enviar datos al activity
        intent.putExtra("name", "Lisandro");

        startActivity(intent);
    }


    public void onClickSpinner(View view){
        Intent intent = new Intent(MainActivity.this, SpinnerActivity.class);
        startActivity(intent);

    }

    public void onClickProfile(View view){
        Intent intent = new Intent(MainActivity.this, PerfilActivity.class);
        startActivity(intent);
    }

}
