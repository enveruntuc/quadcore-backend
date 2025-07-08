package com.santsg.bookingwebsite.entities.models.search;

import lombok.Data;
import java.util.List;

@Data
public class ArrivalAutocompleteResponseBody {
    private List<ArrivalAutoCompleteItem> items;

    public List<ArrivalAutoCompleteItem> getItems() {
        return items;
    }

    public void setItems(List<ArrivalAutoCompleteItem> items) {
        this.items = items;
    }
}
