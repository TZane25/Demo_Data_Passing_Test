package sg.edu.rp.c346.id20011280.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textViewoutput);

        Intent intentRec = getIntent();
        int value = intentRec.getIntExtra("value", 0);
        char cvalue = intentRec.getCharExtra("value",'z');
        double dvalue = intentRec.getDoubleExtra("value",0.0);
        tvAnswer.setText("Integer value received is: " + value + "\nChar value received is " + cvalue
        + "\nDouble value received is " + dvalue);




    }
}