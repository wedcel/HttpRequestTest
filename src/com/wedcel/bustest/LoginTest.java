package com.wedcel.bustest;

import java.util.HashMap;
import java.util.Map;

import com.wedcel.http.HttpRequest;
import com.wedcel.util.SHA1;

public class LoginTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//http://125.46.82.42:8282/MobileApp
		Map<String,String> map = new HashMap<String,String>();
		SHA1 sha1 = new SHA1();
		map.put("requestParam.equalMap.uukey", "156324789653248");
		map.put("requestParam.equalMap.opLoginname", "anzhuotest");
		map.put("requestParam.equalMap.opPass", sha1.Digest("123456","UTF-8"));
		map.put("requestParam.equalMap.corpCode", "601260");
		String body = HttpRequest.post("http://125.46.82.42:8282/MobileApp/login/login!login.action").form(map).body();;
		System.out.println(body);
	}

}
