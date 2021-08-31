import java.util.ArrayList;

public class parse 
{
	public static void parsee(String data)
	{
		ArrayList<String> var = new ArrayList<String>();
		
		int index = data.indexOf("LOG_REQUEST");
		  
	    if(index != -1)
		  {
					String Substring = "";
					Substring = data.substring(data.indexOf("LOG_TYPE"), data.indexOf("LOG_REQUEST_ENDED"));
					
					Substring = Substring.replace("= , ", "lala");
					Substring = Substring.replace(": , ", "lala1");
					Substring = Substring.replace(" , ", " ");
					Substring = Substring.replace("lala", "= , ");
					Substring = Substring.replace("lala1", ": , ");
					
					String[] words = Substring.split(", ");
					for(int i=0; i<=10; i++)
					{
						String[] variable = words[i].split(" ",3);
					    var.add(variable[2]);
					   // System.out.println(variable[2]);
					}
					/*
					for (String s: words)
					{   
							String[] variable = s.split(" ",4);
						    var.add(variable[3]);
						    System.out.println(variable[3]);
					}*/
					request req = new request();
					req.setLogType(var.get(0));
					req.setId(var.get(1));
					req.setApiName(var.get(2));
					req.setInterfaceName(var.get(3));
					req.setRequest(var.get(4));
					req.setRequestTime(var.get(5));
					req.setOperator(var.get(6));
					req.setType(var.get(7));
					req.setSourceIp(var.get(8));
					req.setMsisdn(var.get(9));
					req.setResourceUrl(var.get(10));
					
					
					req.printRequest();
		  }
	    else
	    {
	    	String Substring = "";
			Substring = data.substring(data.indexOf("LOG_TYPE"), data.indexOf("LOG_RESPONSE_ENDED"));
			
			Substring = Substring.replace("= , ", "lala");
			Substring = Substring.replace(": , ", "lala1");
			Substring = Substring.replace(" , ", " ");
			Substring = Substring.replace("lala", "= , ");
			Substring = Substring.replace("lala1", ": , ");
			Substring = Substring.replaceAll(", \"", ",\"");
			
			String[] words = Substring.split(", ");
			for (String s: words)
			{  
				String[] variable = s.split(" ",3);
			    var.add(variable[2]);
			    //System.out.println(variable[2]);
			}
			
			
			response res = new response();
			
			res.setLogType(var.get(0));
			res.setId(var.get(1));
			res.setLogType(var.get(0));
			res.setId(var.get(1));
			res.setApiName(var.get(2));
			res.setInterfaceName(var.get(3));
			res.setResponse(var.get(4));
			res.setResponseTime(var.get(5));
			res.setMsisdn(var.get(6));
			res.setOperator(var.get(7));
			res.setType(var.get(8));
			res.setStatus(var.get(9));
			
			
			res.printResponse();
			
			
			
	    }
	    
	    
	}
}
