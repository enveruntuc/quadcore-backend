package com.santsg.bookingwebsite.entities.models.checkin;

import lombok.Data;
import java.util.List;

@Data
public class CheckInDayResponseBody {
    private List<String> dates;
}