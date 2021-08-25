package com.poultrydesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbarmenu,menu);
        return true;
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case R.id.id_share:
                Toast.makeText(getApplicationContext(), "share", Toast.LENGTH_SHORT).show();

                    break;
            case R.id.id_about:
                Toast.makeText(getApplicationContext(), "about", Toast.LENGTH_SHORT).show();

                break;

            case R.id.id_exit:
                Toast.makeText(getApplicationContext(), "exit", Toast.LENGTH_SHORT).show();

                break;
            case R.id.id_search:
                Toast.makeText(getApplicationContext(), "search", Toast.LENGTH_SHORT).show();

                break;

            case R.id.id_setting:
                Toast.makeText(getApplicationContext(), "setting", Toast.LENGTH_SHORT).show();

                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}