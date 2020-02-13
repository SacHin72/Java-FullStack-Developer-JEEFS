package com.cpg.bean;

public class Call {
private int callId;
private long calledNumber;
private float duration;
public int getCallId() {
	return callId;
}
public void setCallId(int callId) {
	this.callId = callId;
}
public long getCalledNumber() {
	return calledNumber;
}
public void setCalledNumber(long calledNumber) {
	this.calledNumber = calledNumber;
}
public float getDuration() {
	return duration;
}
public void setDuration(float duration) {
	this.duration = duration;
}
public void parseData(String details)
{
	String[] str=details.split(":");
	setCallId(Integer.parseInt(str[0]));
	setCalledNumber(Long.parseLong(str[1]));
	setDuration(Float.parseFloat(str[2]));
}
}
