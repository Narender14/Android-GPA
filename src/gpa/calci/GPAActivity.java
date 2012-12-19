package gpa.calci;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class GPAActivity extends Activity {
    /** Called when the activity is first created. */
	float result=0;
	float total=0;
	float res=0;
	  Spinner   sp;
	  Spinner   s;
	  Spinner   spd ;
	  Spinner   spdf ;
	  Spinner   sv,sa,sb,sc,sd,se,sx;
	  
	  String  text_a,text_b,text_c,text_d,text_e,text_f,text_g,text_h,text_i,text_j;
	  String text_s;
      String your=null;
     @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maint);
     //////////////////////////////////////////   
   
    
  
    
    String credit[]=new String[]{"Credit","1.5","2","3","4","5","8"};
        String grade[]=new String[]{"Grade","A+","A","B+","B","C+","C","D"};
        String sms[]=new String[]{"Sem","One","Two","Three","Four"};
     
       ////////////////////////////////////////////////////////////////// 
     ////////////////////////////////////*******************  Method For SPINNER ****************//////////////////////////////////////////   
        ArrayAdapter<String> credits = 
            new ArrayAdapter<String> (this, 
            android.R.layout.simple_spinner_item,credit);
         sp = (Spinner)findViewById(R.id.Spinner02); 
       sp.setAdapter(credits);
       
       
       
       ArrayAdapter<String> grades = 
            new ArrayAdapter<String> (this, 
            android.R.layout.simple_spinner_item,grade);
         s = (Spinner)findViewById(R.id.Spinner01); 
        s.setAdapter(grades);
        
        
        
        ArrayAdapter<String> cred = 
            new ArrayAdapter<String> (this, 
            android.R.layout.simple_spinner_item,credit);
           spd = (Spinner)findViewById(R.id.Spinner03); 
        spd.setAdapter(cred);
   
        
        ArrayAdapter<String> grad = 
            new ArrayAdapter<String> (this, 
            android.R.layout.simple_spinner_item,grade);
        spdf = (Spinner)findViewById(R.id.Spinner04); 
        spdf.setAdapter(grad);
      
        
        
        ArrayAdapter<String> cre = 
            new ArrayAdapter<String> (this, 
            android.R.layout.simple_spinner_item,credit);
         sv = (Spinner)findViewById(R.id.Spinner05); 
        sv.setAdapter(cre);
   
        
        ArrayAdapter<String> gra = 
            new ArrayAdapter<String> (this, 
            android.R.layout.simple_spinner_item,grade);
         sa = (Spinner)findViewById(R.id.Spinner06); 
        sa.setAdapter(gra);
   
        
        ArrayAdapter<String> cr = 
            new ArrayAdapter<String> (this, 
            android.R.layout.simple_spinner_item,credit);
           sb = (Spinner)findViewById(R.id.Spinner07); 
        sb.setAdapter(cr);
    
        
        ArrayAdapter<String> gr = 
            new ArrayAdapter<String> (this, 
            android.R.layout.simple_spinner_item,grade);
            sc = (Spinner)findViewById(R.id.Spinner08); 
        sc.setAdapter(gr);
 
        
        ArrayAdapter<String> c = 
            new ArrayAdapter<String> (this, 
            android.R.layout.simple_spinner_item,credit);
          sd = (Spinner)findViewById(R.id.Spinner09); 
        sd.setAdapter(c);
       
        
        ArrayAdapter<String> g = 
            new ArrayAdapter<String> (this, 
            android.R.layout.simple_spinner_item,grade);
           se = (Spinner)findViewById(R.id.Spinner10); 
        se.setAdapter(g);
      
    
        ArrayAdapter<String> gp = 
            new ArrayAdapter<String> (this, 
            android.R.layout.simple_spinner_item,sms);
           sx = (Spinner)findViewById(R.id.Spinner11); 
        sx.setAdapter(gp);
        
        
        
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////******************************* Method For RESET *******************///////////////////
    
    public void onClick(View v){
    	switch(v.getId()){
    	
    	case R.id.button4:
    		
    		 EditText txt1=(EditText) findViewById(R.id.edit1);
    		 EditText txt2=(EditText) findViewById(R.id.edit2);
    		 EditText txt3=(EditText) findViewById(R.id.edit3);
    		 EditText txt4=(EditText) findViewById(R.id.edit4);
    		 EditText txt5=(EditText) findViewById(R.id.edit5);
    		txt1.setText("");
    		txt2.setText("");
    		txt3.setText("");
    		txt4.setText("");
    		txt5.setText("");
    	}
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////
    //////////////****************  Method to Calculate GPA ****************//////////
    
    private float GPA_CALCULATE(String a,String b) {
		// TODO Auto-generated method stub
    	float temp;
    	if(a.equals("Credit"))
    		temp=0;
    	else
    		temp=Float.parseFloat(a);
    	
    	
    	total=total+temp;
    	
    	if(b.equals("A+")){
    		result=result+10*temp;
    	}
    	else if(b.equals("A")){
    		result=result+9*temp;
    	}
    	else if(b.equals("B+")){
    		result=result+8*temp;
    	}
    	else if(b.equals("B")){
    		result=result+7*temp;
    	}
    	else if(b.equals("C+")){
    		result=result+6*temp;
    	}
    	else if(b.equals("C")){
    		result=result+5*temp;
    	}
    	else if(b.equals("D")){
    		result=result+4*temp;
    	}
    	else if(b.equals("Grade")){
    		result=result+0*temp;
    	}
    	
    	
    	
    	
    	temp=(result/total);
    	  return temp;
    }
    
    
    
    public float input(){
    	
    	
         text_a= sp.getSelectedItem().toString();
       
        text_b=s.getSelectedItem().toString();
        
     // Toast.makeText(getApplicationContext(),text_c+" "+text_g, Toast.LENGTH_SHORT).show();
       res=GPA_CALCULATE(text_a,text_b);
     text_c= spd.getSelectedItem().toString();
         
      text_d=spdf.getSelectedItem().toString();
   
       res=GPA_CALCULATE(text_c,text_d);
     
       
         text_e= sv.getSelectedItem().toString();
         
        
         text_f=sa.getSelectedItem().toString();
         
      res=GPA_CALCULATE(text_e,text_f);
         
        
         text_g= sb.getSelectedItem().toString();
         
        text_h=sc.getSelectedItem().toString();
         
        res=GPA_CALCULATE(text_g,text_h);
          text_i= sd.getSelectedItem().toString();
         
       text_j=se.getSelectedItem().toString();
         
    res=GPA_CALCULATE(text_i,text_j);
 
       return res;
    	
    }
    
    
    public void output(){
    	
    	
        text_a= sp.getSelectedItem().toString();
      
       text_b=s.getSelectedItem().toString();
       
   
    text_c= spd.getSelectedItem().toString();
        
     text_d=spdf.getSelectedItem().toString();
  
    
      
        text_e= sv.getSelectedItem().toString();
        
       
        text_f=sa.getSelectedItem().toString();
  
        text_g= sb.getSelectedItem().toString();
        
       text_h=sc.getSelectedItem().toString();
     
         text_i= sd.getSelectedItem().toString();
        
      text_j=se.getSelectedItem().toString();
        
  
   	
   }
    
    
    
    public void onclick(View v){
    	switch(v.getId()){
    	
    	case R.id.button2:
    		
    		res=input();
    		TextView x=(TextView) findViewById(R.id.text2);
    		
    		String tem=String.valueOf(res);
    		
    		x.setText(tem);
    		your=tem;
    		res=0;
    		result=0;
    		total=0;
    	
    }
    	
  }
    
    
    public void onsave(View v){
         switch(v.getId()){
    	
    	case R.id.button3:
    		project db = new project(this);
    		 EditText d1=(EditText) findViewById(R.id.edit1);
    		 EditText d2=(EditText) findViewById(R.id.edit2);
    		 EditText d3=(EditText) findViewById(R.id.edit3);
    		 EditText d4=(EditText) findViewById(R.id.edit4);
    		 EditText d5=(EditText) findViewById(R.id.edit5);
    		 text_s=sx.getSelectedItem().toString();
    		 
    		 output();
        	 
    		 
				db.add(new get(d1.getText().toString(),text_a,text_b,your),text_s);
				db.add(new get(d2.getText().toString(),text_c,text_d,your),text_s);
				db.add(new get(d3.getText().toString(),text_e,text_f,your),text_s);
	    		 db.add(new get(d4.getText().toString(),text_g,text_h,your),text_s);
	    		 long jk=db.add(new get(d5.getText().toString(),text_i,text_j,your),text_s);
	    		 
				Toast.makeText(getApplicationContext(),jk+" ",Toast.LENGTH_SHORT).show();
    		 
				//Integer sd=db.getContactsCount(text_s);
	    		 
	    	//String z=new Integer(sd).toString();
          
	    	//Toast.makeText(getApplicationContext(),z+" ",Toast.LENGTH_SHORT).show();
	    		
	    		
	    	/*		 
	    		 List<get> contact = db.Display(text_s);       
	    		// Toast.makeText(getApplicationContext(), "hiiii",Toast.LENGTH_SHORT).show();
	    		 
	    		 
	    	        for (get cn : contact) {
	    	            //String log = "Id: "+cn.ID()+" ,Name: " + cn.NAME() + " ,Phone: " + cn.AUTHOR();
	    	        	Toast.makeText(getApplicationContext(), "hiiii",Toast.LENGTH_SHORT).show();
	    	            Toast.makeText(getApplicationContext(),cn.n()+" "+cn.c()+" " +cn.g(), Toast.LENGTH_SHORT).show(); 
	    	        }
	    	        
	     				Toast.makeText(getApplicationContext(), "It Works",Toast.LENGTH_SHORT).show();
	    		 
	         */
         }	
				
				
    		
         }
  }   
    
    
