package com.oup.wscxf.com.oup.wscxf.service;

import com.oup.wscxf.com.oup.wscxf.service.pojo.RequestMessage;
import com.oup.wscxf.com.oup.wscxf.service.pojo.ResponseMessage;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface Hello {
    @WebMethod()
    @WebResult()
    public ResponseMessage sayHello(@WebParam RequestMessage requestMessage);
}
