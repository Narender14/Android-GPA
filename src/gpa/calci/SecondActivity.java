package gpa.calci;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends Activity {

	
	  /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mains);
        
        Toast.makeText(getApplicationContext(), "Second Activity",Toast.LENGTH_SHORT).show();
    }    
     
    public void onClick(View v){
    	switch(v.getId()){
    	case R.id.butt1:
    		Intent i=new Intent(getApplicationContext(),GPAActivity.class);
        	startActivity(i);
        	break;
    	case R.id.butt2:
    		Intent j=new Intent(getApplicationContext(),ThirdActivity.class);
        	startActivity(j);
    	break;
    	}
    
    
    }
    
}  
