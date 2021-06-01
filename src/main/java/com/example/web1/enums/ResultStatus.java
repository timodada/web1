package com.example.web1.enums;

/**
 * @ClassName ResultStatus
 * @Description:
 * @Author lifeng
 * @Date 2021/6/1 13:28
 * @Version 1.0
 */
public enum ResultStatus {
    SUCCESS(100,"操作成功"),
    SUCCESS_ADD(101,"新增成功"),
    SUCCESS_DELETE(102,"删除成功"),
    SUCCESS_UPDATE(103,"修改成功"),
    SUCCESS_QUERY(104,"查询成功"),
    SUCCESS_VALIDATION(105,"验证成功"),
    SUCCESS_UPLOAD(106,"上传成功"),
    SUCCESS_CANCEL(107,"取消成功"),
    SUCCESS_INSTALL(108,"设置成功"),
    FAILED(200,"操作失败"),
    FAILED_ADD(202,"新增失败"),
    FAILED_DELETE(202,"删除失败"),
    FAILED_UPDATE(203,"修改失败"),
    FAILED_QUERY(204,"查询失败"),
    FAILED_VALIDATION(205,"验证失败"),
    FAILED_UPLOAD(206,"上传失败"),
    FAILED_CANCEL(207,"取消失败"),
    FAILED_INSTALL(208,"设置失败"),
    FAILED_DATA_VALIDATION(209,"数据校验失败"),
    EXCEPTION_SERVICE(401,"服务器异常"),
    EXCEPTION_INFORMATION(402,"消息异常"),
    EXCEPTION_TOKEN(403,"TOKEN异常")
    ;


    /**
     * 值
     */
    private  int value;

    /**
     * 原因短语
     */
    private String reasonPhrase;

    ResultStatus(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    public void setReasonPhrase(String reasonPhrase) {
        this.reasonPhrase = reasonPhrase;
    }

    public  static  String getMessage(int value){

        for (ResultStatus resultStatus : values()) {
            if(value==resultStatus.getValue()){
                return resultStatus.reasonPhrase;
            }
        }

        return null;
    }
}
