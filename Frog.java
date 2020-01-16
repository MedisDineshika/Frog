

import java.util.Scanner;


public class Frog{
  
    public static void main(String args[]){  

	
	Scanner s= new Scanner(System.in);
	
	//Scanner sc= new Scanner(System.in);
	System.out.print("Enter the time to see how much distance the frog goes ");		
		
	int time= s.nextInt();
	//int distance = sc.nextInt();
	
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the distance to see how much time takes ");	
	int distance = sc.nextInt();
	int S = time % 8 ;
	int s1= time / 8 ;

	
	switch(S){
			case 1:
				
				System.out.println("When the time is" +time + "Distance  is" + (s1*9+5));
				break;
			case 2:
				
				System.out.println("When the time is" +time + "Distance  is" + (s1*9+5));
				break;	
			case 3:
				
				//System.out.print("Distance  is" + (s1*9+8));
				System.out.println("When the time is" +time + "Distance  is" + (s1*9+5));
				break;
			
			//default:System.out.println("Enter a time more than 8 seconds ");  
			}

	
	

	int T = distance % 9 ;
	int t1= distance / 9 ;


	switch(T){
			case 5:
				
				System.out.println("When the givern Distance is" +distance + "" + "Time  is" + (t1*8+1));
				break;
			case 8:
				
				
				System.out.println("When the givern Distance is" +distance + "" + "Time  is" + (t1*8+1));
				break;	
			
			
			//default:System.out.println("Enter a distance more than 8 seconds ");  
			}



  		

  }  


}













