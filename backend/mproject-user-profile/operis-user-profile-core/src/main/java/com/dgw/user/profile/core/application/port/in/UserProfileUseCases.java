package com.dgw.user.profile.core.application.port.in;

import com.dgw.user.profile.core.application.model.SearchCriteria;
import com.dgw.user.profile.core.application.model.UserProfile;

import java.util.List;
import java.util.Optional;

public interface UserProfileUseCases {
    UserProfile save(UserProfile userProfile);

    List<UserProfile> search(SearchCriteria searchCriteria);

    List<UserProfile> findByEmails(List<String> userProfilesEmails);

    Optional<UserProfile> findByEmail(String email);
}
