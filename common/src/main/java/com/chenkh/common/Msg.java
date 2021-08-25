package com.chenkh.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Msg<T> {

    private boolean success;

    private String reason;

    private T body;

    public  static <V> Msg<V> successMsg(V body){
        Msg<V> msg = new Msg<>();
        msg.success=true;
        msg.body=body;
        return msg;
    }
    public  static <V> Msg<V> failMsg(String reason){
        Msg<V> msg = new Msg<>();
        msg.success=true;
        msg.body=null;
        msg.reason=reason;
        return msg;
    }

}
