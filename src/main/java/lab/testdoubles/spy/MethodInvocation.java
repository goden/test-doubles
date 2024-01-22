package src.main.java.lab.testdoubles.spy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 用於蒐集單次方法呼叫的稽核記錄
 */
public class MethodInvocation {
    /** 被稽核方法的參數清單 */
    private List<Object> params = new ArrayList<>();

    /** 被稽核方法的回傳值 */
    private Object returnedValue;

    /** 被稽核方法的名稱 */
    private String method;

    public List<Object> getParams() {
        return params;
    }

    public Object getReturnedValue() {
        return returnedValue;
    }

    public String getMethod() {
        return method;
    }

    public MethodInvocation addParam(Object param) {
        params.add(param);
        return this;
    }

    public MethodInvocation setReturnedValue(Object val) {
        this.returnedValue = val;
        return this;
    }

    public MethodInvocation setMethod(String method) {
        this.method = method;
        return this;
    }
}
