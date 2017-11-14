package com.zhyea.jspy.agent.constant;

import com.zhyea.jspy.agent.tools.PropKit;

import java.util.Arrays;

public final class Config {

    private static final String[] MONITOR_PACKAGES;

    static {
        PropKit.load("/jspy.properties");
        MONITOR_PACKAGES = getMonitorPackages();
    }


    public static String[] getMonitorPackages() {
        String packages = PropKit.getProp("monitor.packages");
        if (null != packages) {
            String[] arr = packages.split(";");
            Arrays.sort(arr);
            return arr;
        }
        throw new RuntimeException("Monitor packages is blank, please set 'monitor.packages' in jspy.properties");
    }

}
