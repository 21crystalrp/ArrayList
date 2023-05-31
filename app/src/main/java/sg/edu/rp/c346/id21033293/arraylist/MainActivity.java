package sg.edu.rp.c346.id21033293.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

        this.setTitle("ArrayList");

        fruits = new ArrayList<String>();
        fruits.add(0, "apple");
        fruits.add(1, "banana");
        fruits.add(2,"cherry");
        fruits.add(3,"durian");
        String theFruit = fruits.get(1);
        fruits.remove(0);
        fruits.set(fruits.size()-1, "dragon fruit");
        String text = "Fruits\n";
        text += "===\n";

        for (int i = 0; i < fruits.size(); i++) {
            text += fruits.get(i) + "\n";
        }
        tv.setText(text);

    }
}