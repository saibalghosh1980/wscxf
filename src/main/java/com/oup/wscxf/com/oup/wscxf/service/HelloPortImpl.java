package com.oup.wscxf.com.oup.wscxf.service;

import com.oup.wscxf.com.oup.wscxf.service.pojo.RequestMessage;
import com.oup.wscxf.com.oup.wscxf.service.pojo.ResponseMessage;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class HelloPortImpl implements Hello {

    @Override
    public ResponseMessage sayHello(RequestMessage requestMessage) {
        ResponseMessage responseMessage=new ResponseMessage();
        responseMessage.setMessage("Hello "+requestMessage.getName());
        responseMessage.setDate(new Date());
        return responseMessage;
    }
}
