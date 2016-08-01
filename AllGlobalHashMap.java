package com.service.generic.GlobalStructure;

import java.util.HashMap;

public class AllGlobalHashMap {

	public AllGlobalHashMap() {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("unchecked")
	public static HashMap<Integer, String> DecimalHasMap()
	{
		final HashMap<Integer, String> m_decmap = new HashMap<Integer, String>();
		m_decmap.put(34,"&quot");
		m_decmap.put(60,"&lt");
		m_decmap.put(62,"&gt");
		m_decmap.put(160,"&nbsp");
		m_decmap.put(38,"&amp");
		m_decmap.put(162,"cent");
		m_decmap.put(163,"&pound");
		m_decmap.put(167,"&sect");
		m_decmap.put(169,"&copy");
		m_decmap.put(174,"&reg");
		
		return m_decmap;
	}
}
