package com.dgw.project.core.project.port.out.http;

import com.dgw.project.core.project.model.GetUserSubscriptionPayload;
import com.dgw.project.core.project.model.UserSubscription;

public interface UserSubscriptionClient {
    UserSubscription get(GetUserSubscriptionPayload payload);
}
