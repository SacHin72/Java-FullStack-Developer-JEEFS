package com.cpg.bean;

import java.util.*;

public class CallHistory {
	
private List<Call> callList=new ArrayList<>();

public void setCallList(List<Call> callList) 
{
	this.callList = callList;
}

public List<Call> getCallList()
{
	return callList;
}
public void addCall(Call callObj)
{
	callList.add(callObj);
}
public float findTotalDuration(long calledNumber) {
float sum=0;
for(Call obj:callList)
{
	if(calledNumber==(obj.getCalledNumber()))
			{
				sum+=obj.getDuration();
			}
}
return sum;
}
}
