package CNTT.n61133986;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ChieuCao,CanhDay,CanhBen;
    Button TinhDienTich,TinhChuVi;
    TextView KQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChieuCao = (EditText)findViewById(R.id.Cao);
        CanhDay = (EditText)findViewById(R.id.Day);
        CanhBen = (EditText)findViewById(R.id.Canh);
        TinhDienTich = (Button)findViewById(R.id.TinhDT);
        TinhChuVi = (Button)findViewById(R.id.TinhCV);
        KQ = (TextView)findViewById(R.id.KQ);

        TinhDienTich.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int cDay =Integer.parseInt(CanhDay.getText().toString());
                int cCao =Integer.parseInt(ChieuCao.getText().toString());
                int kqua = cDay*cCao;
                KQ.setText(kqua);
            }
        } );
        TinhChuVi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int cDay =Integer.parseInt(CanhDay.getText().toString());
                int cBen =Integer.parseInt(CanhBen.getText().toString());
                int kqua = (cDay+cBen)*2;

                KQ.setText(kqua);
            }
        } );
    }
}