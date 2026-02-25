package com.dgw.subscription.code.model.port.in;

import com.dgw.subscription.code.model.UserSubscription;
import com.dgw.subscription.code.model.model.GetUserSubscriptionsCommand;
import com.dgw.subscription.code.model.model.SubscribeUserCommand;

public interface UserSubscriptionUseCases {

    void subscribeUser(SubscribeUserCommand subscribeUserCommand);

    void unsubscribe(String userEmail);

    UserSubscription get(GetUserSubscriptionsCommand command);
}
