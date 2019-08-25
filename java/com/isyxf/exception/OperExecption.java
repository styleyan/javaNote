package com.isyxf.exception;

/**
 * @author xiaofei.yan
 * @Create 2019-07-18 20:11
 * @Descript oper异常
 */
public class OperExecption extends RuntimeException {
    OperExecption(){}

    public OperExecption(String str) {
        super(str);
    }
}
