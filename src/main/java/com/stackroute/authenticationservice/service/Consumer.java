package com.stackroute.authenticationservice.service;

import com.stackroute.authenticationservice.model.UserDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @Autowired
    private JwtUserDetailsService service;

    @RabbitListener(queues =  "borrower_queue")
    @RabbitListener(queues =  "lender_queue")
    public void consumeLoanDetailsFromQueue(UserDto borrowerDetails) {
        System.out.println("borrower details recieved from queue : " + borrowerDetails);
        service.save(borrowerDetails);
    }

}
