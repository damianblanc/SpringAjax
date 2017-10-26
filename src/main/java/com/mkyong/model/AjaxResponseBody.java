package com.mkyong.model;

import java.util.List;

/**
 * Created by dblanc on 10/26/17.
 */
public class AjaxResponseBody {

    String msg;
    List<User> result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<User> getResult() {
        return result;
    }

    public void setResult(List<User> result) {
        this.result = result;
    }
}
