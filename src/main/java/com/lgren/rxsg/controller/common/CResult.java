package com.lgren.rxsg.controller.common;

import java.io.Serializable;

public class CResult<T> implements Serializable{
	
	private static final long serialVersionUID = -1L;
	// 结果
	private boolean success;
	//错误编号
	private String code;
	//错误详情
	private String msg;
	// 方法返回结果
	private T data;

	public CResult() {}
	
	public boolean isSuccess() {
		return success;
	}
	public CResult<T> setSuccess(boolean success) {
		this.success = success;
        return this;
	}
	public String getCode() {
		return code;
	}
	public CResult<T> setCode(String code) {
		this.code = code;
        return this;
    }
	public String getMsg() {
		return msg;
	}
	public CResult<T> setMsg(String msg) {
		this.msg = msg;
        return this;
    }
	public T getData() {
		return data;
	}

	public CResult<T> setData(T data) {
		this.data = data;
        return this;
    }
	/**
	 * 构建错误对象
	 * @param code 错误编号
	 * @param msg 错误详情
     */
	public static <T> CResult<T> newFailure(String code, String msg) {
		CResult<T> result=new CResult<>();
		result.setSuccess(false);
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}

	/**
	 * 构建成功对象
	 * @param data 返回数据
	 */
	public static <T> CResult<T> newSuccess(T data) {
		CResult<T> result=new CResult<>();
		result.setData(data);
		result.setSuccess(true);
		result.setCode("200");
		result.setMsg("操作成功");
		return result;
	}

    @Override
    public String toString() {
        return "{" +
                "\"success\":" + success +
                ",\"code\":\"" + code + '\"' +
                ",\"msg\":\"" + msg + '\"' +
                ",\"data\":" + data +
                "}";
    }
}
