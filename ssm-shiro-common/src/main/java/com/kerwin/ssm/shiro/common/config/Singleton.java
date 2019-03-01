package com.kerwin.ssm.shiro.common.config;

/**
 * @ClassName: Singleton
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2019-02-28 16:02
 */
public class Singleton
{
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance()
    {
        return ourInstance;
    }

    private Singleton()
    {
    }
}
