package com.example.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

//@Component
@ConditionalOnProperty(prefix = "camel", name = "java-dsl", havingValue = "true")
public class HelloRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

//        JacksonDataFormat jacksonDataFormat = new JacksonDataFormat(Order.class);
//
//        restConfiguration()
//                .component("servlet")
//                .bindingMode(RestBindingMode.auto);
//
//        rest("/api")
//                .consumes(MediaType.APPLICATION_JSON_VALUE)
//                .produces(MediaType.APPLICATION_JSON_VALUE)
//                .get("/hello")
//                .to("direct:hello");
//
//        from("direct:hello")
//                .process(exchange -> {
//                    Order order = new Order("1", "11", "name", 4, 45.0);
//                    exchange.getIn().setBody(order);
//                })
//                .marshal().json(JsonLibrary.Gson)
//                .setHeader(Exchange.HTTP_METHOD, constant("POST"))
//                .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
//                .to("http://localhost:8082/api/v1/newOrder?bridgeEndpoint=true")
//                .unmarshal(jacksonDataFormat)
//                .log(INFO, this.log, "${body}");
    }


}
