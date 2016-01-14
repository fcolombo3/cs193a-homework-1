package com.cs193.francescacolombo.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /* Returns a random String of advice for the Magic 8 Ball to display*/
    public String getAdvice() {
        String[] advice = {"It is certain", "Without a doubt", "Signs point to yes",
                "Reply hazy, try again", "Ask again later", "Cannot predict now", "Very doubtful",
                "Don't count on it", "My sources say no", "Outlook not so good"};
        int rand = new Random().nextInt(advice.length);
        return advice[rand];
    }
    /* Returns a random positive String of advice for the Magic 8 Ball to display*/
    public String getPosAdvice() {
        String[] posAdvice = {"It is certain", "Without a doubt", "Signs point to yes",
                "Absolutely", "You may rely on it", "Outlook good", "As I see it, yes"};
        int randOptimism = new Random().nextInt(posAdvice.length);
        return posAdvice[randOptimism];
    }
    public void ballClick(View view) {
        TextView adviceText = (TextView) findViewById(R.id.adviceLabel);
        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
        if(toggle.isChecked())
            adviceText.setText(getPosAdvice());
        else
            adviceText.setText(getAdvice());
    }
}
