package com.meta.web.util;

import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

/**
 * @Author hvemuri
 * @Generated at 5/15/2018 10:37 AM
 */
public class DateUtil {

    public static String utcFormat(Date date) {
        return DateFormatUtils.formatUTC(date, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'");
    }
}
