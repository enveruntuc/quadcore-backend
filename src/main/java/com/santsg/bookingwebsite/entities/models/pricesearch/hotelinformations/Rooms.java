package com.santsg.bookingwebsite.entities.models.pricesearch.hotelinformations;

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
    private List<Object> thirdPartyInformation;
    private boolean visiblePL;

}
