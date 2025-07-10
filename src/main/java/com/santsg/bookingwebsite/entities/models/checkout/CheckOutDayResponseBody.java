package com.santsg.bookingwebsite.entities.models.checkout;

import lombok.Data;
import java.util.List;

@Data
public class CheckOutDayResponseBody {
    private List<CheckOutDay> checkOutDays;
}