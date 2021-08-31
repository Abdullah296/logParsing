
public class response 
{

	private String LOG_TYPE;
	private String ID;
	private String API_NAME;
	private String INTERFACE_NAME;
	private String RESPONSE;
	private String RESPONSE_TIME;
	private String RESPONSETIME;
	private String MSISDN;
	private String OPERATOR;
	private String TYPE;
	private String STATUS;
	
	
	void setLogType(String LOG_TYPE)
	{
		this.LOG_TYPE = LOG_TYPE;
	}
	void setId(String ID)
	{
		this.ID = ID;
	}
	
	void setApiName(String API_NAME)
	{
		this.API_NAME = API_NAME;
	}
	void setInterfaceName(String INTERFACE_NAME)
	{
		this.INTERFACE_NAME = INTERFACE_NAME;
	}
	void setResponse(String RESPONSE)
	{
		this.RESPONSE = RESPONSE;
	}
	void setResponseTime(String RESPONSE_TIME)
	{
		this.RESPONSE_TIME = RESPONSE_TIME;
		this.RESPONSETIME = RESPONSE_TIME.substring(0, RESPONSE_TIME.length() - 4);
	}
	
	void setOperator(String OPERATOR)
	{
		this.OPERATOR = OPERATOR;
	}
	void setType(String TYPE)
	{
		this.TYPE = TYPE;
	}
	void setStatus(String STATUS)
	{
		this.STATUS = STATUS;
	}
	void setMsisdn(String MSISDN)
	{
		this.MSISDN = MSISDN;
	}
	
	
	void printResponse()
	{		
		System.out.println("{");
		System.out.println("LOG_TYPE : "+LOG_TYPE+",");
		System.out.println("ID : "+ID+",");
		System.out.println("API_NAME : "+API_NAME+",");
		System.out.println("INTERFACE_NAME : "+INTERFACE_NAME+",");
		System.out.println("RESPONSE : "+RESPONSE+",");
		System.out.println("RESPONSE_TIME : "+RESPONSE_TIME+",");
		System.out.println("RESPONSETIME : "+RESPONSETIME+",");
		System.out.println("MSISDN : "+MSISDN+",");
		System.out.println("OPERATOR : "+OPERATOR+",");
		System.out.println("TYPE : "+TYPE+",");
		System.out.println("STATUS : "+STATUS);
		System.out.println("}\n\n\n");
		
	
	}
}
