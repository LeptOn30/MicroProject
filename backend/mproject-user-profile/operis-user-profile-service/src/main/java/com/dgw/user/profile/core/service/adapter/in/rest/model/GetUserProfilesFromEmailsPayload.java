package com.dgw.user.profile.core.service.adapter.in.rest.model;

import java.util.List;

public record GetUserProfilesFromEmailsPayload(List<String> userProfilesEmails) {

}
