package com.example.latihan1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Quiz2 extends Activity{

	EditText edt3,edt4,edt5;
	Button	btn2;
	TextView txt2;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz2);
        	
        edt3=(EditText)findViewById(R.id.edtquiz3);
        edt4=(EditText)findViewById(R.id.edtquiz4);
        edt5=(EditText)findViewById(R.id.edtquiz5);
        btn2=(Button)findViewById(R.id.btnquiz2);
        txt2=(TextView)findViewById(R.id.quiz2);
        
        btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				int bil1=Integer.parseInt(edt3.getText().toString());
				int bil2=Integer.parseInt(edt4.getText().toString());
				int bil3=Integer.parseInt(edt5.getText().toString());
			
				if(bil1 > bil2 && bil2 > bil3){
				
					txt2.setText("Bil 1 paling besar dan bil 3 yang paling kecil ");
				
				}
				else if(bil1 > bil2 && bil2 < bil3){
					
					txt2.setText("Bil 1 paling besar dan bil 2 paling kecil");
				}
				
				else if(bil2 > bil1 && bil1 > bil3){
				
					txt2.setText("Bil 2 paling besar dan bil 3 yang paling kecil ");
				
				}
				else if(bil1 < bil2 && bil2 > bil3){
					
					txt2.setText("Bil 2 paling besar dan bil 1 paling kecil");
				}
				else if(bil3 > bil1 && bil1 > bil2){
					
					txt2.setText("Bil 3 paling besar dan bil 2 yang paling kecil ");
				
				}
				else if(bil3 > bil2 && bil2 > bil1){
					
					txt2.setText("Bil 3 paling besar dan bil 1 paling kecil");
				}
				
				else{
					txt2.setText("Coba lagi");
				
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