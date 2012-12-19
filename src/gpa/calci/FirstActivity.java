package gpa.calci;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class FirstActivity extends Activity{

	  /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
    }    
    
     
    public void onClick(View v){
    	
    	switch(v.getId()){
    	case R.id.butt:
    		Intent i=new Intent(getApplicationContext(),SecondActivity.class);
        	startActivity(i);
    	}
    	
    	
    }
    
}
