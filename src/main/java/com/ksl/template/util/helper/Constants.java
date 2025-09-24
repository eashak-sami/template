package com.ksl.template.util.helper;

public interface Constants {
    String CORRELATION_ID = "correlationId";

    interface Symbols {
        String SPACE = " ";
        String UNDERSCORE = "_";
        String DOT = ".";
        String QUERY = "?";
        String EQUAL = "=";
        String EMPTY = "";
    }

    interface Headers {

    }

    interface RabbitMq {
        String QUEUE = "sample_message_queue";
        String EXCHANGE_NAME = "sample.module.exchange";
        String ROUTING_KEY = "sample.module.routing.key";
    }
}
