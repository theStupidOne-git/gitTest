package gaba.REST.json;

public class personExceptionResponse {

private int status;
private String message;
private long TimeStamp;


public personExceptionResponse() {}
public personExceptionResponse(int status, String message, long timeStamp) {
		super();
		this.status = status;
		this.message = message;
		TimeStamp = timeStamp;
	}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public long getTimeStamp() {
	return TimeStamp;
}
public void setTimeStamp(long timeStamp) {
	TimeStamp = timeStamp;
}

}
