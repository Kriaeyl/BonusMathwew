package sg.edu.rp.dmsd.bonusmathwew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText tv1;
    EditText tv2;
    Button calc;
    ToggleButton oper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.ans1);
        tv2 = findViewById(R.id.ans2);
        calc = findViewById(R.id.calc);
        oper = findViewById(R.id.oper);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first = Double.parseDouble(tv1.getText().toString());
                double second = Double.parseDouble(tv2.getText().toString());
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("owo", first);
                intent.putExtra("uwu", second);
                intent.putExtra("ono",oper.isChecked());
                startActivity(intent);
            }
        });


    }
}
