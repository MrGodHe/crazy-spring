package com.smscenter.utils;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 *
 * @Filename SimpleDateFormatUtils.java
 *
 * @Description 时间格式化工具类
 *
 * @Version 1.0
 *
 * @Author luowang
 *
 * @Email luowang@yiji.com
 *
 * @History <li>Author: luowang</li> <li>Date: 2012-8-31</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 *
 */
public class SimpleDateFormatUtils {

    /**
     * Gyyyy年MM月dd日 HH时mm分ss秒
     *
     * @param date
     * @return
     */
    public static String format0(Date date) {
        return new SimpleDateFormat("Gyyyy年MM月dd日 HH时mm分ss秒").format(date);
    }

    /**
     * asd 'b' yyyy/MM/dd HH:mm
     *
     * @param date
     * @return
     */
    public static String format1(Date date) {
        return new SimpleDateFormat("asd 'b' yyyy/MM/dd HH:mm").format(date);
    }

    /**
     * yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String format2(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

    /**
     * yyyy年MM月dd日 HH时mm分ss秒 E
     *
     * @param date
     * @return
     */
    public static String format3(Date date) {
        return new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E ").format(date);
    }

    /**
     * yyyy/MM/dd E
     *
     * @param date
     * @return
     */
    public static String format4(Date date) {
        return new SimpleDateFormat("yyyy/MM/dd E").format(date);
    }

    /**
     * 一年中的第 D 天 ，第w个星期 ，一个月中第W个星期 ，k时 z时区
     *
     * @param date
     * @return
     */
    public static String format5(Date date) {
        return new SimpleDateFormat("一年中的第 D 天 ，第w个星期 ，一个月中第W个星期 ，k时 z时区").format(date);
    }

    /**
     * yyyyMM月份格式
     *
     * @param date
     * @return
     */
    public static String format6(Date date) {
        return new SimpleDateFormat("yyyyMM").format(date);
    }

    /**
     * yyyyMMdd月份格式
     *
     * @param date
     * @return
     */
    public static String format7(Date date) {
        return new SimpleDateFormat("yyyyMMdd").format(date);
    }

    /**
     * yyyyMMddHHMMSS格式
     *
     * @param date
     * @return
     */
    public static String format8(Date date) {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(date);
    }


    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println("【Gyyyy年MM月dd日 HH时mm分ss秒】:    "+ format0(date));
        System.out.println("【asd 'b' yyyy/MM/dd HH:mm】:        "+ format1(date));
        System.out.println("【yyyy-MM-dd HH:mm:ss】:             "+ format2(date));
        System.out.println("【yyyy年MM月dd日 HH时mm分ss秒 E】:   "+ format3(date));
        System.out.println("【yyyy/MM/dd E】:                    "+ format4(date));
        System.out.println("【一年中的第 D 天 ，第w个星期 ，一个月中第W个星期 ，k时 z时区】:   " + format5(date));
        System.out.println("【yyyyMM】:                          "+ format6(date));
        System.out.println("【yyyyMMdd】:                        "+ format7(date));
        System.out.println("【yyyyMMddHHmmss】:                  "+ format8(date));


        System.out.println(new SimpleDateFormat("D、K、").format(date));


    }

}
