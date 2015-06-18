package com.hackohub.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButtonListners();
    }

    private void setButtonListners(){
        Button num_one    = (Button) findViewById(R.id.num_one);
        Button num_two    = (Button) findViewById(R.id.num_two);
        Button num_three  = (Button) findViewById(R.id.num_three);
        Button num_four   = (Button) findViewById(R.id.num_four);
        Button num_five   = (Button) findViewById(R.id.num_five);
        Button num_six    = (Button) findViewById(R.id.num_six);
        Button num_seven  = (Button) findViewById(R.id.num_seven);
        Button num_eight  = (Button) findViewById(R.id.num_eight);
        Button num_nine   = (Button) findViewById(R.id.num_nine);
        Button num_zero   = (Button) findViewById(R.id.num_zero);
        Button sign_plus  = (Button) findViewById(R.id.sign_plus);
        Button sign_minus = (Button) findViewById(R.id.sign_minus);
        Button sign_multi = (Button) findViewById(R.id.sign_multi);
        Button sign_div   = (Button) findViewById(R.id.sign_div);
        Button sign_equal = (Button) findViewById(R.id.sign_equal);
        Button sign_dot   = (Button) findViewById(R.id.sign_dot);

        num_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
