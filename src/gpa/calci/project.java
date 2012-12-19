package gpa.calci;


import java.util.ArrayList;
	import java.util.List;
	import android.content.ContentValues;
	import android.content.Context;
	import android.database.Cursor;
	import android.database.sqlite.SQLiteDatabase;
	import android.database.sqlite.SQLiteOpenHelper;
	import android.util.Log;
	import android.widget.Toast;
import android.widget.TextView;

	public class project extends SQLiteOpenHelper {
		

		// All Static variables
	    // Database Version
	    private static final int DATABASE_VERSION = 1;
	 
	    // Database Name
	    private static final String DATABASE_NAME = "student";
	 
	    // BOOK table name
	    private static final String TABLE_SEMI = "semO";
	    private static final String TABLE_SEMII = "semT";
	    private static final String TABLE_SEMIII = "semTH";
	    private static final String TABLE_SEMIV = "semF";
	
	    
	    private static final String KEY_BID = "id";
	    private static final String KEY_COURSE = "subject";
	    private static final String KEY_CREDIT= "credit";
	    private static final String KEY_GRADE= "grade";
	    private static final String KEY_SGPA= "sgpa";
	  

	    public project(Context context) {
	        super(context, DATABASE_NAME, null, DATABASE_VERSION);
	        
	        Log.d("INFO1","creating db"+DATABASE_NAME);
	    }
	    
	    
	    @Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
	    	
	    	
	    	String TABLE_ON = "CREATE TABLE " + TABLE_SEMI+ "("
			+ KEY_BID + " INTEGER PRIMARY KEY," + KEY_COURSE + " TEXT,"
			+ KEY_CREDIT + " TEXT," +KEY_GRADE+ " TEXT," + KEY_SGPA + " TEXT" + ")";

	        
	    db.execSQL(TABLE_ON);
	    	 Log.d("INFO2","creating Table"+TABLE_SEMI);
	
	    	 					String TABLE_TW = "CREATE TABLE " + TABLE_SEMII+ "("
			+ KEY_BID + " INTEGER PRIMARY KEY," + KEY_COURSE + " TEXT,"
			+ KEY_CREDIT + " TEXT," +KEY_GRADE+ " TEXT," + KEY_SGPA + " TEXT" + ")";
	    						
	    	 					 db.execSQL(TABLE_TW);
	    	 									
	    	 									

	   String TABLE_TH = "CREATE TABLE " + TABLE_SEMIII+ "("
			+ KEY_BID + " INTEGER PRIMARY KEY," + KEY_COURSE + " TEXT,"
			+ KEY_CREDIT + " TEXT," +KEY_GRADE+ " TEXT,"+ KEY_SGPA + " TEXT" + ")";
	    									
	   db.execSQL(TABLE_TH);						
	    	 		    	 									

	   String TABLE_FR = "CREATE TABLE " + TABLE_SEMIV+ "("
			+ KEY_BID + " INTEGER PRIMARY KEY," + KEY_COURSE + " TEXT,"
			+ KEY_CREDIT + " TEXT," +KEY_GRADE+ " TEXT," + KEY_SGPA + " TEXT" + ")";
	   
	    	 		    	 		    	 					
	   db.execSQL(TABLE_FR);
	   	 		    	 		    	 									
	 							
	    	 									
	    	
	 }

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			
			 // Drop older table if existed
	        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SEMI);
	     // Create tables again
	        onCreate(db);
	        
	     // Drop older table if existed
	        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SEMII);
	        // Create tables again
	           onCreate(db);
	   
	           
	           // Drop older table if existed
	           db.execSQL("DROP TABLE IF EXISTS " + TABLE_SEMIII);
	        // Create tables again
	           onCreate(db);
	           
	        // Drop older table if existed
	           db.execSQL("DROP TABLE IF EXISTS " + TABLE_SEMIV);
	           // Create tables again
	              onCreate(db);
		
	              
	              
	   }
		
		
			public long add(get con,String which){
	    	
				SQLiteDatabase db = this.getWritableDatabase();
				
				String table=TABLE_SEMI;
				
				if(which.equals("One"))
					table=TABLE_SEMI;
				else if(which.equals("Two"))
					table=TABLE_SEMII;
				else if(which.equals("Three"))
					table=TABLE_SEMIII;
				else if(which.equals("Four"))
					table=TABLE_SEMIV;
					
				 Log.d("INFO3","COMES INTO ADD");
				
			ContentValues value=new ContentValues();
	    	value.put(KEY_COURSE,con.n());
	    	value.put(KEY_CREDIT,con.c());
	    	value.put(KEY_GRADE,con.g());
	    	value.put(KEY_SGPA,con.u());
	    	long r=db.insert(table, null, value);
	    	db.close();
	    	 
	    	return r;
	    }
			
			public List<get> Display(String which){
				
				
				String table=null;
				if(which.equals("One"))
					table=TABLE_SEMI;
				else if(which.equals("Two"))
					table=TABLE_SEMII;
				else if(which.equals("Three"))
					table=TABLE_SEMIII;
				else if(which.equals("Four"))
					table=TABLE_SEMIV;
				
				List<get> P=new ArrayList<get>();
		    	
		    	String qr="SELECT * FROM "+table;
		    	 SQLiteDatabase db = this.getWritableDatabase();
		    	Cursor cr=db.rawQuery(qr, null);
		    	
		    	if (cr.moveToFirst()) {
		        do {
		                get contact = new get();
		                contact.setn(cr.getString(1));
		                contact.setc(cr.getString(2));
		                contact.setg(cr.getString(3));
		                contact.setu(cr.getString(4));
		                // Adding contact to list
		                P.add(contact);
		           } while (cr.moveToNext());
		        }
		 	   	return P;
				
		}
			
			
			 public int getContactsCount(String which) {
				 
				 String table=null;
					if(which.equals("One"))
						table=TABLE_SEMI;
					else if(which.equals("Two"))
						table=TABLE_SEMII;
					else if(which.equals("Three"))
						table=TABLE_SEMIII;
					else if(which.equals("Four"))
						table=TABLE_SEMIV;
					
				 
			        String countQuery = "SELECT  * FROM " +table;
			        SQLiteDatabase db = this.getReadableDatabase();
			        Cursor cursor = db.rawQuery(countQuery, null);
			       
			      Integer ret= cursor.getCount();
			        cursor.close();
			        return ret;
			        
			    }
			
			 
			// Deleting single contact
			    public void deleteContact() {
			        SQLiteDatabase db = this.getWritableDatabase();
			        db.delete(TABLE_SEMI, null,
			                null);
			        db.close();
			        
			        Log.d("INFO2","Deleting");
			    }
			
			
				
	}////class ENDS 


