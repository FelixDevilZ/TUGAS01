package com.example.latihan1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {
	ListView lsatu;
	String[] menu={"Profil", "Quiz", "Exit"};
	
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        lsatu=(ListView)findViewById(R.id.lvsatu);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        		android.R.layout.simple_list_item_1, menu);
        lsatu.setAdapter(adapter);
        lsatu.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				if(arg2==0){
					Intent intentprofil= new Intent(MainActivity.this,Profil.class);
					startActivity(intentprofil);
				}
				else if(arg2==1){
					Intent intentquiz= new Intent(MainActivity.this,Halamanquiz.class);
					startActivity(intentquiz);
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
