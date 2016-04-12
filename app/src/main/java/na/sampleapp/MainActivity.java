package na.sampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        setContentView(R.layout.activity_main_activity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_class, menu);
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

    public void showMessage(View view) {
        //(findViewById(R.id.textView)).setVisibility(View.VISIBLE);//Raw code. Never used.
        //Code to create references to Views textView and button3
        TextView textView = (TextView) findViewById(R.id.textView);
        Button button3 = (Button) findViewById(R.id.button3);

        //Logic
        if(textView.getVisibility() == View.INVISIBLE) {
            textView.setVisibility(View.VISIBLE);
            button3.setText(R.string.button3Text2);
        } else {
            textView.setVisibility(View.INVISIBLE);
            button3.setText(R.string.button3Text1);
        }

    }

    public void callSubActivity(View view) {
        Intent forActivityTwo = new Intent(this, SubActivity.class);
        startActivity(forActivityTwo);
    }
}
