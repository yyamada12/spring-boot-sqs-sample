package com.example.sqssample.handler;


import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class SampleHandler {

    @SqsListener("sample-queue")
    public void handleMessage(String message) {
        System.out.println("Received: " + message);
    }
}
