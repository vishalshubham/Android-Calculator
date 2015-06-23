package com.hackohub.calculator;

import android.app.ActionBar;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public static final String NUM1     = "Number 1";

    public static final String OPERATOR = "Operator";
    public static final String LOGTAG   = "LogTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        Log.d(LOGTAG, "Before Num1 value: " + prefs.getLong(NUM1, 0));
        Log.d(LOGTAG, "Before Oper value: " + prefs.getString(OPERATOR, ""));
        editor.putLong(NUM1, 0);
        editor.putString(OPERATOR, "");
        editor.commit();
        Log.d(LOGTAG, "After Num1 value: " + prefs.getLong(NUM1, 0));
        Log.d(LOGTAG, "After Oper value: " + prefs.getString(OPERATOR, ""));

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
        Button sign_rest  = (Button) findViewById(R.id.sign_restart);
        Button sign_del   = (Button) findViewById(R.id.sign_del);

        num_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                editText.getText().append("1");
                Log.d(LOGTAG,"Clicked 1");
            }
        });
        num_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                editText.getText().append("2");
                Log.d(LOGTAG, "Clicked 2");
            }
        });
        num_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                editText.getText().append("3");
                Log.d(LOGTAG, "Clicked 3");
            }
        });
        num_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                editText.getText().append("4");
                Log.d(LOGTAG, "Clicked 4");
            }
        });
        num_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                editText.getText().append("5");
                Log.d(LOGTAG, "Clicked 5");
            }
        });
        num_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                editText.getText().append("6");
                Log.d(LOGTAG, "Clicked 6");
            }
        });
        num_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                editText.getText().append("7");
                Log.d(LOGTAG, "Clicked 7");
            }
        });
        num_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                editText.getText().append("8");
                Log.d(LOGTAG, "Clicked 8");
            }
        });
        num_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                editText.getText().append("9");
                Log.d(LOGTAG, "Clicked 9");
            }
        });
        num_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                editText.getText().append("0");
                Log.d(LOGTAG, "Clicked 0");
            }
        });
        sign_rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                editText.setText("");
                EditText editText1 = (EditText) findViewById(R.id.whole_cal);
                editText1.setText("0");
                SharedPreferences prefs = getPreferences(MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putLong(NUM1, 0);
                editor.putString(OPERATOR, "");
                editor.commit();
                Log.d(LOGTAG, "Clicked C");
            }
        });

        sign_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                Log.d(LOGTAG,"Clicked +");
                if(TextUtils.isEmpty(editText.getText().toString())){
                    Toast toast = Toast.makeText(MainActivity.this,"You need to enter a number first",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 360);
                    toast.show();
                }
                else{
                    SharedPreferences prefs = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    Log.d(LOGTAG, "Num1 saving");
                    if(prefs.getLong(NUM1,0)==0 && prefs.getString(OPERATOR,"").equals("")){
                        Log.d(LOGTAG, "Num1 & Operator saved");
                        editor.putLong(NUM1, Long.parseLong(editText.getText().toString()));
                        editor.putString(OPERATOR, "+");
                        editor.commit();
                        editText.setText("");
                    }
                    else if(prefs.getLong(NUM1,0)!=0 && prefs.getString(OPERATOR,"").equals("")) {
                        Log.d(LOGTAG, "Operator + saved");
                        editor.putString(OPERATOR, "+");
                        editor.commit();
                        editText.setText("");
                    }
                    else{
                        Log.d(LOGTAG, "Num1 already present");
                        Toast toast = Toast.makeText(MainActivity.this,"You need to click equal first",Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 360);
                        toast.show();
                    }
                }
            }
        });
        sign_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                Log.d(LOGTAG,"Clicked -");
                if(TextUtils.isEmpty(editText.getText().toString())){
                    Toast toast = Toast.makeText(MainActivity.this,"You need to enter a number first",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 360);
                    toast.show();
                }
                else{
                    SharedPreferences prefs = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    Log.d(LOGTAG, "Num1 saving");
                    if(prefs.getLong(NUM1,0)==0 && prefs.getString(OPERATOR,"").equals("")){
                        Log.d(LOGTAG, "Num1 & Operator saved");
                        editor.putLong(NUM1, Long.parseLong(editText.getText().toString()));
                        editor.putString(OPERATOR, "-");
                        editor.commit();
                        editText.setText("");
                    }
                    else if(prefs.getLong(NUM1,0)!=0 && prefs.getString(OPERATOR,"").equals("")) {
                        Log.d(LOGTAG, "Operator - saved");
                        editor.putString(OPERATOR, "-");
                        editor.commit();
                        editText.setText("");
                    }
                    else{
                        Log.d(LOGTAG, "Num1 already present");
                        Toast toast = Toast.makeText(MainActivity.this,"You need to click equal first",Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 360);
                        toast.show();
                    }
                }
            }
        });
        sign_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                Log.d(LOGTAG,"Clicked *");
                if(TextUtils.isEmpty(editText.getText().toString())){
                    Toast toast = Toast.makeText(MainActivity.this,"You need to enter a number first",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 360);
                    toast.show();
                }
                else{
                    SharedPreferences prefs = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    Log.d(LOGTAG, "Num1 saving");
                    if(prefs.getLong(NUM1,0)==0 && prefs.getString(OPERATOR,"").equals("")){
                        Log.d(LOGTAG, "Num1 & Operator saved");
                        editor.putLong(NUM1, Long.parseLong(editText.getText().toString()));
                        editor.putString(OPERATOR, "*");
                        editor.commit();
                        editText.setText("");
                    }
                    else if(prefs.getLong(NUM1,0)!=0 && prefs.getString(OPERATOR,"").equals("")) {
                        Log.d(LOGTAG, "Operator * saved");
                        editor.putString(OPERATOR, "*");
                        editor.commit();
                        editText.setText("");
                    }
                    else{
                        Log.d(LOGTAG, "Num1 already present");
                        Toast toast = Toast.makeText(MainActivity.this,"You need to click equal first",Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 360);
                        toast.show();
                    }
                }
            }
        });
        sign_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                Log.d(LOGTAG,"Clicked /");
                if(TextUtils.isEmpty(editText.getText().toString())){
                    Toast toast = Toast.makeText(MainActivity.this,"You need to enter a number first",Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 360);
                    toast.show();;
                }
                else{
                    SharedPreferences prefs = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    Log.d(LOGTAG, "Num1 saving");
                    if(prefs.getLong(NUM1,0)==0 && prefs.getString(OPERATOR,"").equals("")){
                        Log.d(LOGTAG, "Num1 & Operator saved");
                        editor.putLong(NUM1, Long.parseLong(editText.getText().toString()));
                        editor.putString(OPERATOR, "/");
                        editor.commit();
                        editText.setText("");
                    }
                    else if(prefs.getLong(NUM1,0)!=0 && prefs.getString(OPERATOR,"").equals("")) {
                        Log.d(LOGTAG, "Operator / saved");
                        editor.putString(OPERATOR, "/");
                        editor.commit();
                        editText.setText("");
                    }
                    else{
                        Log.d(LOGTAG, "Num1 already present");
                        Toast toast  = Toast.makeText(MainActivity.this,"You need to click equal first",Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 360);
                        toast.show();
                    }
                }
            }
        });
        sign_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.textbox);
                Log.d(LOGTAG,"Clicked =");
                if(TextUtils.isEmpty(editText.getText().toString())){
                    Toast toast = Toast.makeText(MainActivity.this, "You need to enter a number first", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 360);
                    toast.show();
                }
                else{
                    SharedPreferences prefs = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    Log.d(LOGTAG, "Getting Result...");
                    if(prefs.getLong(NUM1,0)!=0 && prefs.getString(OPERATOR,"").equals("+")){
                        EditText editText1 = (EditText) findViewById(R.id.whole_cal);
                        if (editText1.getText().toString().equals("0")) {
                            editText1.setText(prefs.getLong(NUM1,0) + "+" + Long.parseLong(editText.getText().toString()));
                        }
                        else{
                            editText1.setText("(" + editText1.getText().append(")+" + Long.parseLong(editText.getText().toString())));
                        }
                        Long result = prefs.getLong(NUM1,0) + Long.parseLong(editText.getText().toString());
                        Log.d(LOGTAG,"Result: "+result);
                        editor.putLong(NUM1, result);
                        editor.putString(OPERATOR,"");
                        editor.commit();
                        editText.setText(result.toString());
                    }
                    else if(prefs.getLong(NUM1,0)!=0 && prefs.getString(OPERATOR,"").equals("-")){
                        EditText editText1 = (EditText) findViewById(R.id.whole_cal);
                        if (editText1.getText().toString().equals("0")) {
                            editText1.setText(prefs.getLong(NUM1,0) + "-" + Long.parseLong(editText.getText().toString()));
                        }
                        else{
                            editText1.setText("(" + editText1.getText().append(")-" + Long.parseLong(editText.getText().toString())));
                        }
                        Long result = prefs.getLong(NUM1,0) - Long.parseLong(editText.getText().toString());
                        Log.d(LOGTAG,"Result: "+result);
                        editor.putLong(NUM1, result);
                        editor.putString(OPERATOR,"");
                        editor.commit();
                        editText.setText(result.toString());
                    }
                    else if(prefs.getLong(NUM1,0)!=0 && prefs.getString(OPERATOR,"").equals("*")){
                        EditText editText1 = (EditText) findViewById(R.id.whole_cal);
                        if (editText1.getText().toString().equals("0")) {
                            editText1.setText(prefs.getLong(NUM1,0) + "*" + Long.parseLong(editText.getText().toString()));
                        }
                        else{
                            editText1.setText("(" + editText1.getText().append(")*" + Long.parseLong(editText.getText().toString())));
                        }
                        Long result = prefs.getLong(NUM1,0) * Long.parseLong(editText.getText().toString());
                        Log.d(LOGTAG,"Result: "+result);
                        editor.putLong(NUM1, result);
                        editor.putString(OPERATOR,"");
                        editor.commit();
                        editText.setText(result.toString());
                    }
                    else if(prefs.getLong(NUM1,0)!=0 && prefs.getString(OPERATOR,"").equals("/")){
                        if(Long.parseLong(editText.getText().toString()) != 0){
                            EditText editText1 = (EditText) findViewById(R.id.whole_cal);
                            if (editText1.getText().toString().equals("0")) {
                                editText1.setText(prefs.getLong(NUM1,0) + "/" + Long.parseLong(editText.getText().toString()));
                            }
                            else{
                                editText1.setText("(" + editText1.getText().append(")/" + Long.parseLong(editText.getText().toString())));
                            }
                            Long result = prefs.getLong(NUM1,0) / Long.parseLong(editText.getText().toString());
                            Log.d(LOGTAG,"Result: "+result);
                            editor.putLong(NUM1, result);
                            editor.putString(OPERATOR,"");
                            editor.commit();
                            editText.setText(result.toString());
                        }
                        else{
                            Toast toast = Toast.makeText(MainActivity.this,"Second number cannot be 0 in Division",Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 360);
                            toast.show();
                        }
                    }
                }
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
