package com.zhyea.jspy.agent.constant;

import java.util.Arrays;

/**
 * 配置信息维护类
 */
public final class Config {

    public static final String[] MONITOR_PACKAGES;

    static {
        PropKit.load("/jspy.properties");
        MONITOR_PACKAGES = getMonitorPackages();
    }


    private static String[] getMonitorPackages() {
        String packages = PropKit.getProp("monitor.packages");
        if (null != packages) {
            String[] arr = packages.split(";");
            Arrays.sort(arr);
            return arr;
        }
        return new String[]{};
    }

}
