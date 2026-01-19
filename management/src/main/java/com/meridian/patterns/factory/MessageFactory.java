package com.meridian.patterns.factory;

public class MessageFactory {
    public Message createMessage(String type){
        if (type.equals("SMS")) {
            return new SMSMessage();

        }else if (type.equals("EMAIl")){
            return new EmailMessage();
        }
        return null;

    }
}
