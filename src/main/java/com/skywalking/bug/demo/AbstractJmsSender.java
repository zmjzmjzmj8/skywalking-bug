package com.skywalking.bug.demo;

/**
 * <p></p>
 *
 * @author zhaomingjie
 * @version : AbstractJmsSender, v1.0 2019/5/14 15:15 zhaomingjie Exp $
 */
public abstract class AbstractJmsSender<T> {


    public String send(T content) {
        System.out.println("AbstractJmsSender send");
        try {
            return "AbstractJmsSender";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}