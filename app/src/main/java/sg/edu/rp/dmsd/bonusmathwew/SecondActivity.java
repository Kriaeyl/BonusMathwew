package sg.edu.rp.dmsd.bonusmathwew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1 = findViewById(R.id.sol);
        Intent OWO = getIntent();
        double one = OWO.getDoubleExtra("owo",0);
        double two = OWO.getDoubleExtra("uwu",0);
        double three = 0;
        char four = '/';
        if (OWO.getBooleanExtra("ono", true)) {
            three = one + two;
            four = '+';
        }
        else {
            three = one * two;
            four = '*';
        }
        tv1.setText("" + one + " " + four + " " + two + " is " + three);


    }
}
