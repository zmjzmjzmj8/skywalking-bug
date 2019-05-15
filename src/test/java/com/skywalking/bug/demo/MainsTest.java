package com.skywalking.bug.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * <p></p>
 *
 * @author zhaomingjie
 * @version : MainsTest, v1.0 2019/5/14 15:30 zhaomingjie Exp $
 */
public class MainsTest extends DemoApplicationTests{

    @Autowired
    BSender sender;

    @Test
    public void main() {
        String test = sender.memberSend("test","a");
    }
}