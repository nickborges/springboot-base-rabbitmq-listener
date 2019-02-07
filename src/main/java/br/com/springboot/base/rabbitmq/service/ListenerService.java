package br.com.springboot.base.rabbitmq.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ListenerService {

    private static final Logger log = LoggerFactory.getLogger(ListenerService.class);

    @RabbitListener(queues = "${queue.order.name}")
    public void receiveMessage(final CustomMessage customMessage) {
        log.info(">>> Received Message >>> {}", customMessage.toString());
    }
}