package ru.netology.web.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class RegistrationByCustomerInfo {
    private final String city;
    private final String fullName;
    private final String phoneNumber;
    private final String meetingDate;
    private final String replanDate;
}
