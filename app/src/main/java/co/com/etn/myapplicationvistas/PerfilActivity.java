package co.com.etn.myapplicationvistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PerfilActivity extends AppCompatActivity {
    private Spinner syncSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        initViews();
    }

    private void initViews() {
        syncSpinner = (Spinner) findViewById(R.id.perfil_spinner_sync_with);
        loadDataSpinner();
    }

    private void loadDataSpinner() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.sync_with_array,
                R.layout.support_simple_spinner_dropdown_item);


        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        syncSpinner.setAdapter(adapter);


    }
}
