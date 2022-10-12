package com.example.camel.processor;

import com.example.camel.Order;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class OrderProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        Order newOrder = Order.newBuilder()
                .setOrderId(exchange.getIn().getHeader("orderId").toString())
                .setCustomerId(exchange.getIn().getHeader("customerId").toString())
                .setAmount(Double.parseDouble(exchange.getIn().getHeader("amount").toString()))
                .setItemName(exchange.getIn().getHeader("itemName").toString())
                .setQuantity(Integer.parseInt(exchange.getIn().getHeader("quantity").toString())).build();

        exchange.getIn().setBody(newOrder);


    }
}
