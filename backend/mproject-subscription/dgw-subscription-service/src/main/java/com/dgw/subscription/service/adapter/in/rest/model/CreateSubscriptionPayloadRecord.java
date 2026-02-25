package com.dgw.operis.subscription.service.adapter.in.rest.model;

import com.dgw.subscription.code.model.Feature;
import com.dgw.subscription.code.model.model.CreateSubscriptionCommand;

import java.util.List;

public record CreateSubscriptionPayloadRecord(String name, String description, List<Feature> features) {

    public CreateSubscriptionCommand toCommand() {
        return new CreateSubscriptionCommand(
                name(),
                description(),
                features
        );
    }

}
