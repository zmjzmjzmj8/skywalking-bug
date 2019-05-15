package com.skywalking.bug.demo;

import org.springframework.stereotype.Service;

/**
 * <p></p>
 *
 * @author zhaomingjie
 * @version : BSender, v1.0 2019/5/14 15:15 zhaomingjie Exp $
 */
@Service
public class BSender extends ASender {

    @Override
    public String memberSend(String content, String con2) {
        System.out.println("BSender memberSend");
        try {
            return super.send(content);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
