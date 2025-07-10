package com.santsg.bookingwebsite.entities.models.pricesearch.response;

import lombok.Data;
import java.util.List;

@Data
public class Rooms {
    private String roomId;
    private String roomName;
    private String boardId;
    private String boardName;
    private List<Object> boardGroups;
    private int stopSaleGuaranteed;
    private int stopSaleStandart;
    private List<Traveller> travellers;
    private ThirdPartyInformation thirdPartyInformation;
    private boolean visiblePL;

}
