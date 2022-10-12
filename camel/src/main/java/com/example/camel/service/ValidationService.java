package com.example.camel.service;

import com.example.camel.Status;
import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;

@Component
public class ValidationService {

    @Handler
    public void validateResponse(Exchange exchange){
        Status status = exchange.getIn().getBody(Status.class);
        System.out.println(status);
    }
}
