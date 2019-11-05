package com.example.latihan1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Quiz1 extends Activity{
	
	EditText edt1, edt2;
	Button btn1;
	TextView txt1;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1);
    
        edt1=(EditText)findViewById(R.id.edtquiz1);
        edt2=(EditText)findViewById(R.id.edtquiz2);
        btn1=(Button)findViewById(R.id.btnquiz1);
        txt1=(TextView)findViewById(R.id.quiz1);
    
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				int bil1=Integer.parseInt(edt1.getText().toString());
				int bil2=Integer.parseInt(edt2.getText().toString());
				
				if(bil1 > bil2){
					txt1.setText("Bil1 Lebih Besar dari Bil 2");
			
				}
				else if(bil1==bil2){
					txt1.setText("Bil1 sama dengan Bil2");
				}
				else {
					txt1.setText("Bil2 Lebih Besar Bil1");
				}
			}
			});
	}	
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
