package com.example.cloud.web.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.cloud.web.common.exception.error.CommonErrorCode;

import java.io.Serializable;

/**
 * 返回统一数据结构
 *
 * @author purgeyao
 * @since 1.0
 */

public class Result<T> implements Serializable {

  /**
   * 是否成功
   */
  private Boolean success;

  /**
   * 服务器当前时间戳
   */
  private Long ts = System.currentTimeMillis();

  /**
   * 成功数据
   */
  private T data;

  /**
   * 错误码
   */
  private int code;

  /**
   * 错误描述
   */
  private String message;

  public static Result ofSuccess() {
    Result result = new Result();
    result.success = true;
    result.code = 20000;
    return result;
  }

  public static Result ofSuccess(Object data) {
    Result result = new Result();
    result.success = true;
    result.code = 20000;
    result.setData(data);
    return result;
  }

  public static Result ofFail(int code, String msg) {
    Result result = new Result();
    result.success = false;
    result.code = code;
    result.message = msg;
    return result;
  }

  public static Result ofFail(int code, String msg, Object data) {
    Result result = new Result();
    result.success = false;
    result.code = code;
    result.message = msg;
    result.setData(data);
    return result;
  }

  public static Result ofFail(CommonErrorCode resultEnum) {
    Result result = new Result();
    result.success = false;
    result.code = Integer.parseInt(resultEnum.getCode());
    result.message = resultEnum.getMessage();
    return result;
  }

  /**
   * 获取 json
   */
  public String buildResultJson(){
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("success", this.success);
    jsonObject.put("code", this.code);
    jsonObject.put("ts", this.ts);
    jsonObject.put("message", this.message);
    jsonObject.put("data", this.data);
    return JSON.toJSONString(jsonObject, SerializerFeature.DisableCircularReferenceDetect);
  }

  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public Long getTs() {
    return ts;
  }

  public void setTs(Long ts) {
    this.ts = ts;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
