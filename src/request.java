
public class request {

	private String LOG_TYPE;
	private String ID;
	private String API_NAME;
	private String INTERFACE_NAME;
	private String REQUEST;
	private String REQUEST_TIME;
	private String REQUESTTIME;
	private String OPERATOR;
	private String TYPE;
	private String SOURCE_IP;
	private String MSISDN;
	private String RESOURCE_URI;
	
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
	void setRequest(String REQUEST)
	{
		this.REQUEST = REQUEST;
	}
	void setRequestTime(String REQUEST_TIME)
	{
		this.REQUEST_TIME = REQUEST_TIME;
		this.REQUESTTIME = REQUEST_TIME.substring(0, REQUEST_TIME.length() - 4);
		
	}
	void setOperator(String OPERATOR)
	{
		this.OPERATOR = OPERATOR;
	}
	void setType(String TYPE)
	{
		this.TYPE = TYPE;
	}
	void setSourceIp(String SOURCE_IP)
	{
		this.SOURCE_IP = SOURCE_IP;
	}
	void setMsisdn(String MSISDN)
	{
		this.MSISDN = MSISDN;
	}
	void setResourceUrl(String RESOURCE_URI)
	{
		this.RESOURCE_URI = RESOURCE_URI;
	}
	
	void printRequest()
	{
		
		System.out.println("{");
		System.out.println("LOG_TYPE : "+LOG_TYPE+",");
		System.out.println("ID : "+ID+",");
		System.out.println("API_NAME : "+API_NAME+",");
		System.out.println("INTERFACE_NAME : "+INTERFACE_NAME+",");
		System.out.println("REQUEST : "+REQUEST+",");
		System.out.println("REQUEST_TIME : "+REQUEST_TIME+",");
		System.out.println("REQUESTTIME : "+REQUESTTIME+",");
		System.out.println("OPERATOR : "+OPERATOR+",");
		System.out.println("TYPE : "+TYPE+",");
		System.out.println("SOURCE_IP : "+SOURCE_IP+",");
		System.out.println("MSISDN : "+MSISDN+",");
		System.out.println("RESOURCE_URI : "+RESOURCE_URI);
		System.out.println("}\n\n\n");
		
	
	}
	
}
