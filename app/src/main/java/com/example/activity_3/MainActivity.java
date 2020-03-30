package com.example.activity_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    public Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.tbng:
                intent = new Intent(getApplicationContext(), menu_1.class);
                startActivity(intent);
                break;
            case R.id.blk:
                intent = new Intent(getApplicationContext(), menu_2.class);
                startActivity(intent);
                break;
            case R.id.kbs:
                intent = new Intent(getApplicationContext(), menu_3.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
