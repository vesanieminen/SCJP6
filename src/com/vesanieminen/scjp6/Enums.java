package com.vesanieminen.scjp6;

public class Enums {

	public static void main(String[] args) {
		System.out.println(Error.FILE_NOT_FOUND.getCode());
	}

}

enum Error {
	FILE_NOT_FOUND(100),
	UNEXPECTED_OPERATION(200),
	SYSTEM_ERROR(300);
	
	private int code;
	
	Error(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}	
	
}
