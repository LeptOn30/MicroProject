package com.dgw.operis.subscription.service.adapter.in.rest.model;

import com.dgw.subscription.code.model.model.SubscribeUserCommand;

public record CreateUserSubscriptionPayloadRecord(String subscriptionId) {

    public SubscribeUserCommand toCommand(String connectedUserEmail) {
        return new SubscribeUserCommand(
                connectedUserEmail,
                subscriptionId
        );
    }

}
