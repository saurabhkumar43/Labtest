package Com.Question3;

public class StudentMarks {

    public static void main(String arg[])
    {
        //name array
    	String names[] = { "saurabh", "rohit", "rahul", "rishav", "amit" };
        //marks array
    	int marks[] = { 80, 40, 70, 70, 85 };
        //rank array
    	int rank[] = { 1, 2, 3, 4, 5 };
        
        //printing output
    	for(int i = 0; i < names.length; i++)
        {
            System.out.println( names[i] + " has secured rank " + rank[i] + " got " + marks[i] + " marks." );
        }    
    }

}
