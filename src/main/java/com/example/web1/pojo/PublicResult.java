package com.example.web1.pojo;

import com.example.web1.constant.IntConstants;
import com.example.web1.enums.ResultStatus;

import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName publicResult
 * @Description: 接口统一返回值
 * @Author lifeng
 * @Date 2021/6/1 11:42
 * @Version 1.0
 */
public class  PublicResult<T> implements Serializable {
    /**
     * 状态
     */
    private  Integer status;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;


    public  PublicResult(Integer status, String msg) {
        this(status,msg,null);
    }

    public   PublicResult(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static <T> PublicResult<T> success(){
        return new PublicResult(ResultStatus.SUCCESS.getValue(),ResultStatus.SUCCESS.getReasonPhrase(),null);
    }

    public static <T> PublicResult<T> success(String msg,T data){
        return  new PublicResult(ResultStatus.SUCCESS.getValue(),msg,data);
    }

    public static <T> PublicResult<T> success(T data){
        return new PublicResult(ResultStatus.SUCCESS.getValue(),ResultStatus.SUCCESS.getReasonPhrase(),data);
    }

    public static <T> PublicResult<T> failed(){
        return new PublicResult(ResultStatus.FAILED.getValue(),ResultStatus.FAILED.getReasonPhrase(),null);
    }

    public static <T> PublicResult<T> failed(String msg,T data){
        return  new PublicResult(ResultStatus.FAILED.getValue(),msg,data);
    }

    public static <T> PublicResult<T> failed(T data){
        return new PublicResult(ResultStatus.FAILED.getValue(),ResultStatus.FAILED.getReasonPhrase(),data);
    }
    public static <T> PublicResult<T> build(Integer status, String msg, T data){
        return new PublicResult(status,msg,data);
    }

    public static <T> PublicResult<T> buildAddSuccess(){
        return new PublicResult(ResultStatus.SUCCESS_ADD .getValue(),ResultStatus.SUCCESS_ADD.getReasonPhrase(),null);
    }

    public static <T> PublicResult<T> buildAddSuccess(T data){
        return new PublicResult(ResultStatus.SUCCESS_ADD.getValue(),ResultStatus.SUCCESS_ADD.getReasonPhrase(),data);
    }

    public static <T> PublicResult<T> buildUpdateSuccess(){
        return new PublicResult(ResultStatus.SUCCESS_UPDATE .getValue(),ResultStatus.SUCCESS_UPDATE.getReasonPhrase(),null);
    }

    public static <T> PublicResult<T> buildUpdateSuccess(T data){
        return new PublicResult(ResultStatus.SUCCESS_UPDATE.getValue(),ResultStatus.SUCCESS_UPDATE.getReasonPhrase(),data);
    }

    public static <T> PublicResult<T> buildDeleteSuccess(){
        return new PublicResult(ResultStatus.SUCCESS_DELETE .getValue(),ResultStatus.SUCCESS_DELETE.getReasonPhrase(),null);
    }

    public static <T> PublicResult<T> buildDeleteSuccess(T data){
        return new PublicResult(ResultStatus.SUCCESS_DELETE.getValue(),ResultStatus.SUCCESS_DELETE.getReasonPhrase(),data);
    }

    public static <T> PublicResult<T> buildQuerySuccess(){
        return new PublicResult(ResultStatus.SUCCESS_QUERY .getValue(),ResultStatus.SUCCESS_QUERY.getReasonPhrase(),null);
    }

    public static <T> PublicResult<T> buildQuerySuccess(T data){
        return new PublicResult(ResultStatus.SUCCESS_QUERY.getValue(),ResultStatus.SUCCESS_QUERY.getReasonPhrase(),data);
    }

    public static <T> PublicResult<T> buildAddFAILED(){
        return new PublicResult(ResultStatus.FAILED_ADD .getValue(),ResultStatus.FAILED_ADD.getReasonPhrase(),null);
    }

    public static <T> PublicResult<T> buildAddFAILED(T data){
        return new PublicResult(ResultStatus.FAILED_ADD.getValue(),ResultStatus.FAILED_ADD.getReasonPhrase(),data);
    }

    public static <T> PublicResult<T> buildUpdateFAILED(){
        return new PublicResult(ResultStatus.FAILED_UPDATE .getValue(),ResultStatus.FAILED_UPDATE.getReasonPhrase(),null);
    }

    public static <T> PublicResult<T> buildUpdateFAILED(T data){
        return new PublicResult(ResultStatus.FAILED_UPDATE.getValue(),ResultStatus.FAILED_UPDATE.getReasonPhrase(),data);
    }

    public static <T> PublicResult<T> buildDeleteFAILED(){
        return new PublicResult(ResultStatus.FAILED_DELETE .getValue(),ResultStatus.FAILED_DELETE.getReasonPhrase(),null);
    }

    public static <T> PublicResult<T> buildDeleteFAILED(T data){
        return new PublicResult(ResultStatus.FAILED_DELETE.getValue(),ResultStatus.FAILED_DELETE.getReasonPhrase(),data);
    }

    public static <T> PublicResult<T> buildQueryFAILED(){
        return new PublicResult(ResultStatus.FAILED_QUERY .getValue(),ResultStatus.FAILED_QUERY.getReasonPhrase(),null);
    }

    public static <T> PublicResult<T> buildQueryFAILED(T data){
        return new PublicResult(ResultStatus.FAILED_QUERY.getValue(),ResultStatus.FAILED_QUERY.getReasonPhrase(),data);
    }


    public boolean ok(){
        if(null != this.status && this.status < IntConstants.TWO_HUNDRED){
            return  true;
        }
        return false;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
