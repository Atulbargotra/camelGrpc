package com.example.orderservice.processor;

import com.example.camel.Order;
import com.example.camel.Status;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class NewOrderProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        Order body = exchange.getIn().getBody(Order.class);
        if(body.getQuantity() < 0) exchange.getIn().setBody(Status.newBuilder().setStatus(false).build());
        else{
            exchange.getIn().setBody(Status.newBuilder().setStatus(true).build());
        }
    }
}
