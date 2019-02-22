package com.zcsj.wx.vo;

import java.io.Serializable;

public class BaseResultVO<T> implements Serializable{

	private static final long serialVersionUID = 1L;

	private String errorCode;
    
	private String message;
    
	private T resultData;
	
	public BaseResultVO(){
	}

	public BaseResultVO(String errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}

	public BaseResultVO(String errorCode, String message, T resultData) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.resultData = resultData;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResultData() {
		return resultData;
	}

	public void setResultData(T resultData) {
		this.resultData = resultData;
	}
}
