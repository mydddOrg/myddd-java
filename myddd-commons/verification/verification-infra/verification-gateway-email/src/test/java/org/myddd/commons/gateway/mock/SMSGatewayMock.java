package org.myddd.commons.gateway.mock;


import org.myddd.commons.sms.application.SMSGateway;

import jakarta.inject.Named;

@Named
public class SMSGatewayMock implements SMSGateway {
    @Override
    public void sendSmsToMobile(String mobile, String code) {

    }
}
