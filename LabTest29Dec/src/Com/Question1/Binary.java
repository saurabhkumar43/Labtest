package Com.Question1;

public class Binary {
	
	public void binary(int decimal)
	{
		 int binary[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	     }    
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }    
	}

}
