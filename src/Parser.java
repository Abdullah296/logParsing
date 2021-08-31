
import java.util.ArrayList;



public class Parser 
{
		public static void main(String [] args)
		{
			
			
			ArrayList<String> logs = new ArrayList<String>();

			Readfile read = new Readfile();
			logs = read.readfile("data3.txt");
			
			for (int i = 0; i < logs.size(); i++)
			{
				int index = logs.get(i).indexOf("LOG_TYPE_CHATBOT");
				if(index != -1)
				{
					System.out.println(logs.get(i));
					parse.parsee(logs.get(i));
				}
			      
			}
			
			
			
		}
}
