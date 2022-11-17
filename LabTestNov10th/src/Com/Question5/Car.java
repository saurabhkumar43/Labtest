package Com.Question5;

public class Car {
	
	//enum
		enum car{scorpio(2020), xylo(2016), jaguar(2022), bolero(2015);
			int i;
			car(int i)
			{
				this.i= i;
			}};
		
		//main method
			public static void main(String[] args)
		{
			for(car c:car.values())
			{
				System.out.println(c+"-"+c.i);
			}
		}

}
