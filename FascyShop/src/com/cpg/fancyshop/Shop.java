package com.cpg.fancyshop;

import java.util.*;

public class Shop {
	private Map<Integer,String> productMap=new TreeMap<>();

	public Map<Integer, String> getProductMap() 
	{
		return productMap;
	}

	public void setProductMap(Map<Integer, String> productMap)
	{
		this.productMap = productMap;
	}
	public void addProductDetails(int serialNumber, String productName)
	{
		productMap.put(serialNumber,productName);
	}
	public List<String> searchBasedOnProduct(String productType)
	{
		List<String > list=new ArrayList<>();
		for(Map.Entry<Integer, String> entry:productMap.entrySet())
			{
				if(entry.getValue().contains(productType))
					{
						list.add(entry.getValue());
					}
			}
	 return list;
 }
}
