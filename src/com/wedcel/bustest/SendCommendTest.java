package com.wedcel.bustest;

import java.util.HashMap;
import java.util.Map;

import com.wedcel.http.HttpRequest;

public class SendCommendTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("requestParam.equalMap.uukey",  "156324789653248"  );
		map.put("requestParam.equalMap.commandType",  "message"  );
		map.put("list[0].opId",  "144743"  );
		map.put("list[0].vid", "10126");
		map.put("list[0].vehicleNo", "��N88889");
		map.put("list[0].coOemcode", "E001");
		map.put("list[0].commaddr", "15290424072");
		map.put("mccCommand.message", "���Է���");
			
		map.put("mccCommand.advertisingAttValue", "0");
		map.put("mccCommand.ttsAttValue", "0");
		map.put("mccCommand.screenAttValue", "0");
		map.put("mccCommand.emergencyAttValue", "0");
		
		String body = HttpRequest.post("http://125.46.82.42:8282/MobileApp/mcc/mcc!sendCommand.action").form(map).body();;
		System.out.println(body);
	}

}
