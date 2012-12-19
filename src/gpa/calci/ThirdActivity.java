package gpa.calci;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends Activity {

	TextView tv1;
	  TextView tv2;
	  TextView tv3;
	  TextView tv4;
	  TextView tv5;
	  TextView tv6;
	  TextView tv7;
	  TextView tv8;
	  TextView tv9;
	  TextView tv10;
	  TextView tv11;
	  TextView tv12;
	  TextView tv13;
	  TextView tv14;
	  TextView tv15;
	  TextView tv16;
	  
	 String sms[]=new String[]{"Sem","One","Two","Three","Four"};
	  Spinner  sx;
	  String text_s;
		  /** Called when the activity is first created. */
	  
	   
	     @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.mainth);
	        
	        
	       tv1=(TextView) findViewById(R.id.tex1);
	  	 tv2=(TextView) findViewById(R.id.tex2);
	  	  tv3=(TextView) findViewById(R.id.tex3);
	  	  tv4=(TextView) findViewById(R.id.tex4);
	  	   tv5=(TextView) findViewById(R.id.tex5);
	  	   tv6=(TextView) findViewById(R.id.tex6);
	  	   tv7=(TextView) findViewById(R.id.tex7);
	  	   tv8=(TextView) findViewById(R.id.tex8);
	  	   tv9=(TextView) findViewById(R.id.tex9);
	  	   tv10=(TextView) findViewById(R.id.tex10);
	  	   tv11=(TextView) findViewById(R.id.tex11);
	  	   tv12=(TextView) findViewById(R.id.tex12);
	  	   tv13=(TextView) findViewById(R.id.tex13);
	  	   tv14=(TextView) findViewById(R.id.tex14);
	  	   tv15=(TextView) findViewById(R.id.tex15);
	  	 tv16=(TextView) findViewById(R.id.tex16);
	        
	        
	        ArrayAdapter<String> gp = 
	            new ArrayAdapter<String> (this, 
	            android.R.layout.simple_spinner_item,sms);
	       sx= (Spinner)findViewById(R.id.Spinner11); 
	        sx.setAdapter(gp);
	        
	        
	        
	    }    
	     
	    public void onClick(View v){
	    	switch(v.getId()){
	    	case R.id.butt3:
	    			
	    		text_s=sx.getSelectedItem().toString();
	    	
	    	Toast.makeText(getApplicationContext(),"Display Activity",Toast.LENGTH_SHORT).show();
	    	
	    	project db = new project(this);
	    	
	    	 List<get> contact = db.Display(text_s);       
	    		// Toast.makeText(getApplicationContext(), "hiiii",Toast.LENGTH_SHORT).show();
	    		 
	    		 int i=1;
	    	        for (get cn : contact) {
	    	            //String log = "Id: "+cn.ID()+" ,Name: " + cn.NAME() + " ,Phone: " + cn.AUTHOR();
	    	        	//Toast.makeText(getApplicationContext(), "hiiii",Toast.LENGTH_SHORT).show();
	    	            //Toast.makeText(getApplicationContext(),cn.n()+" "+cn.c()+" " +cn.g(), Toast.LENGTH_SHORT).show(); 
	    	           Dis(cn.n(),cn.c(),cn.g(),cn.u(),i);
	    	            i++;
	    	        }
	    	        
	    	        
	    	        
	     				//Toast.makeText(getApplicationContext(), "It Works",Toast.LENGTH_SHORT).show();
	    		 
	         
	    	
	     					
	    	
	    	
	    	}
	    
	    
	}
	    
	   public void Dis(String ax ,String bx ,String cx,String dx,int k){
	    	
	    	tv16.setText(dx);
	    	if(k==1){
	    		tv1.setText(ax);
	    		tv2.setText(bx);
	    		tv3.setText(cx);
	    	}
	    	else if(k==2){
	    		
	    		tv4.setText(ax);
	    		tv5.setText(bx);
	    		tv6.setText(cx);
	    	}
	    	
	    	else if(k==3){
	    		
	    		tv7.setText(ax);
	    		tv8.setText(bx);
	    		tv9.setText(cx);
	    	}
         else if(k==4){
	
        	 tv10.setText(ax);
        	 tv11.setText(bx);
        	 tv12.setText(cx);
         }
         	else if(k==5){
	
         		
         			tv13.setText(ax);
         			tv14.setText(bx);
         			tv15.setText(cx);
     	}
	    	
	    	
	   }
	    
	   }
