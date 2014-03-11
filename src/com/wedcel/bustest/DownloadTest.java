package com.wedcel.bustest;

import java.io.File;

import com.wedcel.http.HttpRequest;

public class DownloadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpRequest.get("").receive(new File(""));
	}

}
