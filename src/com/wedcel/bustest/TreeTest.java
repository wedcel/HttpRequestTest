package com.wedcel.bustest;

import java.util.HashMap;
import java.util.Map;

import com.wedcel.http.HttpRequest;
import com.wedcel.util.SHA1;

public class TreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//http://125.46.82.42:8282/MobileApp
		Map<String,String> map = new HashMap<String,String>();
		SHA1 sha1 = new SHA1();
		map.put("requestParam.equalMap.uukey", "156324789653248");
		map.put("requestParam.equalMap.entId", "200");
		map.put("requestParam.equalMap.entType", "1");
		map.put("requestParam.equalMap.treeType", "1");
		map.put("requestParam.equalMap.root", "false");
		map.put("requestParam.likeMap.all", "all");
		
		String body = HttpRequest.post("http://125.46.82.42:8282/MobileApp/tree/tree!findSynchronizedTreeByParam.action").form(map).body();;
		System.out.println(body);
	}

}
