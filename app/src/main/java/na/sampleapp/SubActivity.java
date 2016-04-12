package na.sampleapp;

//import android.content.Intent;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

public class SubActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Intent fromMain = getIntent();//not needed now

        setContentView(R.layout.activity_sub_activity);
    }

    public void callMainActivity(View view) {
        /**
         * Code deprecated, as it generated unnecessary number of activities.
         * An overridden version of onBackPressed() is called instead.
         */
        //Intent forActivityOne = new Intent(this, MainActivity.class);
        //startActivity(forActivityOne);
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
