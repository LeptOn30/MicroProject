package com.dgw.subscription.code.model.port.out.persistence;

import com.dgw.subscription.code.model.Subscription;

import java.util.List;

public interface SubscriptionRepository {

    Subscription save(Subscription subscription);

    Subscription findById(String subscriptionId);

    List<Subscription> findAll();
}
