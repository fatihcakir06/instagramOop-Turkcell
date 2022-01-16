package instagramOop;

public class DirectMessage extends Interaction{
	private String sendMessage;
	private String call;
	private String request;
	private String [] messages;
	
	
	
	
	public DirectMessage() {
		super();
	}




	public DirectMessage(String sendMessage, String call, String request, String[] messages) {
		super();
		this.sendMessage = sendMessage;
		this.call = call;
		this.request = request;
		this.messages = messages;
	}




	public String getSendMessage() {
		return sendMessage;
	}




	public void setSendMessage(String sendMessage) {
		this.sendMessage = sendMessage;
	}




	public String getCall() {
		return call;
	}




	public void setCall(String call) {
		this.call = call;
	}




	public String getRequest() {
		return request;
	}




	public void setRequest(String request) {
		this.request = request;
	}




	public String[] getMessages() {
		return messages;
	}




	public void setMessages(String[] messages) {
		this.messages = messages;
	}
	
	
	
}
