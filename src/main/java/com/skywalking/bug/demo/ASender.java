package com.skywalking.bug.demo;

import org.springframework.stereotype.Service;

/**
 * <p></p>
 *
 * @author zhaomingjie
 * @version : ASender, v1.0 2019/5/14 15:15 zhaomingjie Exp $
 */
@Service
public class ASender extends AbstractJmsSender<String> {

    public String memberSend(String content) {
        System.out.println("ASender memberSend");
        try {
            return memberSend(content, "b");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public String memberSend(String content, String con2) {
        System.out.println("ASender memberSend");
        return "ASender";
    }

}
