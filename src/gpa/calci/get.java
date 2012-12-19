package gpa.calci;

public class get {

	String nm;
	String cr;
	String gr;
	String u;
	
	public get(){
		
		
	}
	
	public get(String x,String y,String z,String a){
		nm=x;
		cr=y;
		gr=z;
		u=a;		
	}
	
	
	public String n(){
		
		return nm;
	}
	
	public String c(){
		
		return cr;
	}

	public String g(){
	
	return gr;
	}
	
	
	public String u(){
		
		return u;
		}
	
	
	
public void setn(String ab){
		
		 nm=ab;
	}
	
	public void setc(String bc){
		
		cr=bc;
	}

	public void setg(String cd){
	
	 gr=cd;
}
	
	public void setu(String de){
		
		u=de;
	}
	
	
}
