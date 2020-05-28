package com.isyxf.genericity;

import java.util.List;

/**
 * @author xiaofei.yan
 * @Create 2020-03-20 15:15
 * @Descript 接口泛型
 */
public interface PayLoadList<E, P>{
    void setPayload(E index, P val);
}
