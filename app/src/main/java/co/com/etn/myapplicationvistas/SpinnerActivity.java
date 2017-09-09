package co.com.etn.myapplicationvistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner animalsSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        initViews();

    }

    private void initViews() {
        loadDataSpinner();
    }

    private void loadDataSpinner() {
       animalsSpinner = (Spinner) findViewById(R.id.activity_spinner_spinner_animals);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.animals_array,
                R.layout.support_simple_spinner_dropdown_item);


        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        animalsSpinner.setAdapter(adapter);


        animalsSpinner.setOnItemSelectedListener(this);



    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String animal = (String) adapterView.getSelectedItem();
        Toast.makeText(this, "Animal:" + animal, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
