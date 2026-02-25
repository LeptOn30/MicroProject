package com.dgw.operis.subscription.service.adapter.in.rest.model;

import com.dgw.subscription.code.model.Feature;
import com.dgw.subscription.code.model.Subscription;

import java.util.List;

public record SubscriptionDto(String id,
                              String name,
                              String description,
                              List<Feature> features) {

    public static SubscriptionDto from(Subscription domain) {
        return new SubscriptionDto(
                domain.id(),
                domain.name(),
                domain.description(),
                domain.features()
        );
    }
}
