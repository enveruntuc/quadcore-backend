package com.santsg.bookingwebsite.entities.models.pricesearch.response.hotels;

import lombok.Data;
import java.util.List;

@Data
public class Rooms {
    private int partNo;
    private String roomId;
    private String roomName;
    private List<Object> roomGroups;
    private String accomId;
    private String accomName;
    private String boardId;
    private String boardName;
    private List<BoardGroups> boardGroups;
    private int allotment;
    private int stopSaleGuaranteed;
    private int stopSaleStandart;
    private Price price;
    private List<Traveller> travellers;
    private ThirdPartyInformation thirdPartyInformation;
    private boolean visiblePL;
    private Spo spo;

}
