package com.isyxf.exception;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author xiaofei.yan
 * @Create 2019-08-12 22:29
 * @Descript aaa
 * partnerName: "小米小额",
 *     partnerCode: "demo",
 *     total: 1,
 *     day: "2018-11-19",
 */
public class Test {
    static public JSONObject createObj(String partnerName, String partnerCode, int total, String day) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("partnerName", partnerName);
        jsonObject.put("partnerCode", partnerCode);
        jsonObject.put("total", total);
        jsonObject.put("day", day);

        return jsonObject;
    }

    static public JSONObject getReslt(List<JSONObject> list) {
        JSONObject result = new JSONObject();

        for (JSONObject entry : list) {
            String partnerCode = entry.getString("partnerCode");

            JSONObject curr = result.getJSONObject(partnerCode);

            if (curr == null) {
                JSONObject item = new JSONObject();
                item.put("name", entry.get("partnerName"));
                item.put(entry.getString("day"), entry.getLong("total"));
                item.put("total", entry.getLong("total"));

                result.put(partnerCode, item);
            }else {
                curr.put(entry.getString("day"), entry.getLong("total"));
                curr.put("total", entry.getLong("total") + curr.getLong("total"));
            }
        }

        return result;
    }

    /**
     * @title 根据开始时间，结束时间获取期间所有日期yyyy-MM-dd
     * 例：开始时间：2019-05-01 结束时间：2019-05-05
     * @return java.util.List<java.lang.String>
     */
    public static List<String> findDates(String stime, String etime) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern_ymd);
        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern_ymd);
        Date dBegin = sdf.parse(stime);
        Date dEnd = sdf.parse(etime);

        List<String> allDate = new ArrayList();
        allDate.add(sdf1.format(dBegin));
        Calendar calBegin = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calBegin.setTime(dBegin);
        Calendar calEnd = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calEnd.setTime(dEnd);
        // 测试此日期是否在指定日期之后
        while (dEnd.after(calBegin.getTime())) {
        // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            allDate.add(sdf1.format(calBegin.getTime()));
        }
        return allDate;
    }

    public static final String pattern_ym = "yyyyMM";
    public static final String pattern_ymd = "yyyy-MM-dd";

    public static String format(Date date, String pattern) {
        DateFormat format = new SimpleDateFormat(pattern);
        return format.format(date);
    }
    public static Date parse(String date, String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        try {
            return format.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
    /**
     * 获取开始及结束日期间隔年份列表
     * start格式 "2015-01-01"
     * end格式 "2016-01-01"
     * @param start
     * @param end
     * @return
     */
    public static List<String> getMonths(String start, String end) {
        List<String> dateList = new ArrayList<String>();
        if (StringUtils.isNotBlank(start) && StringUtils.isNotBlank(end)) {
            Date dBegin = Test.parse(start, Test.pattern_ymd);
            Date dEnd = Test.parse(end, Test.pattern_ymd);

            Calendar calBegin = Calendar.getInstance();
            // 使用给定的 Date 设置此 Calendar 的时间
            calBegin.setTime(dBegin);
            int yearMonth1 = (calBegin.get(Calendar.YEAR)) * 100 + calBegin.get(Calendar.MONTH);
            Calendar calEnd = Calendar.getInstance();
            // 使用给定的 Date 设置此 Calendar 的时间
            calEnd.setTime(dEnd);
            int yearMonth2 = (calEnd.get(Calendar.YEAR)) * 100 + calEnd.get(Calendar.MONTH);
            // 测试此日期是否在指定日期之后
            while (yearMonth2 >= yearMonth1) {
                dateList.add(Test.format(calBegin.getTime(), Test.pattern_ym));
                calBegin.add(Calendar.MONTH, 1);
                yearMonth1 = (calBegin.get(Calendar.YEAR)) * 100 + calBegin.get(Calendar.MONTH);
            }
        }
        return dateList;
    }

    /**
     * 获取当月的开始日期和结束日期
     */
    static public Map<String, Object> getMonthDay(){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        Map<String, Object> result = new HashMap<String, Object>();

        c.add(Calendar.MONTH, 0);
        // 设置为1号,当前日期既为本月第一天
        c.set(Calendar.DAY_OF_MONTH,1);
        result.put("start", format.format(c.getTime()));

        //获取当前月最后一天
        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        result.put("end", format.format(ca.getTime()));

        return result;
    }


    public static void main(String[] args) {
        String str = "121.41.38.213-63030";

        String[] result = str.split("-");

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
