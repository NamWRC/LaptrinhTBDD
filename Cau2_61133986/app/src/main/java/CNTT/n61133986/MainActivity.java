package CNTT.n61133986;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLitePoem Poem = new SQLitePoem(MainActivity.this);
        Poem PO1= new Poem("0001"+System.currentTimeMillis(),"Gio");
        Poem PO2= new Poem("0002"+System.currentTimeMillis(),"Song");
        Poem PO3= new Poem("0003"+System.currentTimeMillis(),"Xuan");
        Poem.add(PO1);
        Poem.add(PO2);
        Poem.add(PO3);
    }
}