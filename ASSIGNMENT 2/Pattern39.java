class Pattern39{
public static void main(String args[]){
	
 for(int i=1;i<=9;i++)
 {
	 for(int j=1;j<=(9-i);j++){
		 System.out.print(" ");
	 }
	 for(int j=1;j<=i;j++){
	    
		System.out.print("*"+" "); 

	 }
	 System.out.println(" ");
 }
}
}