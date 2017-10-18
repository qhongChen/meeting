package xin.qhongchen.meeting.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultUtil {

    private static final int STATUS_CODE_SUCCESS = 1;
    private static final int STATUS_CODE_FAILURE = 0;

    private Map<String, Object> result = new HashMap<>();
    private int code = 0;
    private String message = "";

    public ResultUtil() {}

    public ResultUtil(String message) {
        this.message = message;
    }

    public ResultUtil(int statusCode) {
        this.code = statusCode;
    }

    public ResultUtil(int statusCode, String message) {
        this.code = statusCode;
        this.message = message;
    }

    public ResultUtil setData(Object object) {
        this.result.put("data", object);
        return this;
    }

    public static ResultUtil success(String message) {
        return new ResultUtil(STATUS_CODE_SUCCESS, message);
    }

    public static ResultUtil error(String message) { return new ResultUtil(STATUS_CODE_FAILURE,message); }

    public Map toMap() {
        this.result.put("code", this.code);
        this.result.put("message", this.message);
        return this.result;
    }

}
