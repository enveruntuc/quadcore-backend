package com.santsg.bookingwebsite.entities.models.search;
import lombok.Data;

@Data
public class ArrivalAutoCompleteRequest {
    private int ProductType;
    private String Query;
    private String Culture;

    public int getProductType() {
        return ProductType;
    }

    public void setProductType(int productType) {
        this.ProductType = productType;
    }

    public String getQuery() {
        return Query;
    }

    public void setQuery(String query) {
        this.Query = query;
    }

    public String getCulture() {
        return Culture;
    }

    public void setCulture(String culture) {
        this.Culture = culture;
    }
}
