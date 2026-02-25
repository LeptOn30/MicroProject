package com.dgw.operis.subscription.service.adapter.out.persistence.Subscription;

import com.dgw.operis.subscription.service.adapter.out.persistence.UserSubscription.UserSubscriptionEntity;
import com.dgw.operis.subscription.service.adapter.out.persistence.converter.FeatureListConverter;
import com.dgw.subscription.code.model.Feature;
import com.dgw.subscription.code.model.Subscription;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subscription")
public class SubscriptionEntity {

    @Id
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Convert(converter = FeatureListConverter.class)
    @Column(nullable = false)
    private List<Feature> features;

    @OneToMany(mappedBy = "subscription")
    private List<UserSubscriptionEntity> userSubscriptions = new ArrayList<>();

    public static SubscriptionEntity from(Subscription subscription) {
        return new SubscriptionEntity(
                subscription.id(),
                subscription.name(),
                subscription.description(),
                subscription.features(),
                null
        );
    }

    public Subscription toDomain() {
        return new Subscription(
                this.id,
                this.name,
                this.description,
                this.features
        );
    }

}
