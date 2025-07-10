package com.santsg.bookingwebsite.entities.models.hotelproductinfo;

import com.santsg.bookingwebsite.entities.models.pricesearch.response.*;

public class HotelProductInfoResponse {
    /*
     * 
     * {
     * 
     * "hotel": {
     * "seasons": [
     * {
     * "name": "General",
     * "textCategories": [
     * {
     * "name": "Location",
     * "presentations": [
     * {
     * "textType": 3,
     * "text":
     * "This apartment-complex is situated around 1 km from the beach and the town centre with numerous shops and entertainment venues. Public transport stops are right by the building and Antalya Airport is located 15 km away from the hotel."
     * }
     * ]
     * },
     * {
     * "name": "Facilities",
     * "presentations": [
     * {
     * "textType": 3,
     * "text":
     * "Renovated in 2006, this complex features a pleasant garden and a total of 7 floors with 64 apartments. Guests may make use of the foyer with 24-hour reception desk, a safe, a currency exchange and a lift as well as air conditioning throughout. Further facilities include an air-conditioned restaurant, a WLAN Internet terminal as well as a car park."
     * }
     * ]
     * },
     * {
     * "name": "Rooms",
     * "presentations": [
     * {
     * "textType": 3,
     * "text":
     * "The welcoming rooms come with a bathroom, a direct dial telephone, TV, kitchenette, minibar, individually regulated air conditioning, combined living and bed room, a separate bedroom with a double bed and a balcony."
     * }
     * ]
     * },
     * {
     * "name": "Sports/Entertainment",
     * "presentations": [
     * {
     * "textType": 3,
     * "text":
     * "The apartment hotel offers its guests use of a swimming pool, a children's pool, a snack/ pool bar and a sun terrace with sun beds and parasols laid out ready for use. It is possible to play table tennis."
     * }
     * ]
     * },
     * {
     * "name": "Meals",
     * "presentations": [
     * {
     * "textType": 3,
     * "text":
     * "Guests are offered breakfast and evening meals in the form of a buffet."
     * }
     * ]
     * },
     * {
     * "name": "Payment",
     * "presentations": [
     * {
     * "textType": 3,
     * "text":
     * "American Express, MasterCard and VISA are accepted as methods of payment."
     * }
     * ]
     * }
     * ],
     * "facilityCategories": [
     * {
     * "name": "General",
     * "facilities": [
     * {
     * "id": "67",
     * "name": "Air conditioning",
     * "isPriced": false
     * },
     * {
     * "id": "68",
     * "name": "Lobby",
     * "isPriced": false
     * },
     * {
     * "id": "69",
     * "name": "24-hour reception",
     * "isPriced": false
     * },
     * {
     * "id": "70",
     * "name": "24-hour check-in",
     * "isPriced": false
     * },
     * {
     * "id": "71",
     * "name": "Hotel Safe",
     * "isPriced": false
     * },
     * {
     * "id": "72",
     * "name": "Currency Exchange",
     * "isPriced": false
     * },
     * {
     * "id": "75",
     * "name": "Lifts",
     * "isPriced": false
     * },
     * {
     * "id": "81",
     * "name": "Bar(s)",
     * "isPriced": false
     * },
     * {
     * "id": "88",
     * "name": "Restaurant(s)",
     * "isPriced": false
     * },
     * {
     * "id": "89",
     * "name": "Restaurant(s) with air conditioning ",
     * "isPriced": false
     * },
     * {
     * "id": "90",
     * "name": "Restaurant(s) with non-smoking area",
     * "isPriced": false
     * },
     * {
     * "id": "95",
     * "name": "WLAN access",
     * "isPriced": false
     * },
     * {
     * "id": "96",
     * "name": "Room Service",
     * "isPriced": true
     * },
     * {
     * "id": "97",
     * "name": "Laundry Service",
     * "isPriced": true
     * },
     * {
     * "id": "101",
     * "name": "Car Park",
     * "isPriced": false
     * },
     * {
     * "id": "194",
     * "name": "TV Room",
     * "isPriced": false
     * }
     * ]
     * }
     * ],
     * "mediaFiles": [
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;80b3e329100e6cb8ca6012f29607f1f3;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/80b3e329100e6cb8ca6012f29607f1f3.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;c99c1383f3a191fdca9054840f1dfc51;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/c99c1383f3a191fdca9054840f1dfc51.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;0548ed6b263d07f82da0d9d98b1eaad3;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/0548ed6b263d07f82da0d9d98b1eaad3.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;b29b9c41871717c0ba28104ca76ed52f;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/b29b9c41871717c0ba28104ca76ed52f.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;bf6b294b9ce11ff61666faba45f56868;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/bf6b294b9ce11ff61666faba45f56868.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;01da409fd9c61cd35b104e0c49a364ca;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/01da409fd9c61cd35b104e0c49a364ca.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;5adbb79c356edb04c2c282bdceb7e4c6;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/5adbb79c356edb04c2c282bdceb7e4c6.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;d37f12af6692541c951d8de9c355ef18;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/d37f12af6692541c951d8de9c355ef18.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;5af9a6fc80fd0177507f41e1351f7fba;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/5af9a6fc80fd0177507f41e1351f7fba.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;a6d556eb2ffa64cb3f7f4e50182c78e0;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/a6d556eb2ffa64cb3f7f4e50182c78e0.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;024c7d922c65c0154c40a7fc1e1114e7;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/024c7d922c65c0154c40a7fc1e1114e7.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;a5b3715986ada5040b7b2db3e8f0086a;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/a5b3715986ada5040b7b2db3e8f0086a.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;529cb92e688af976dc8b639403d48976;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/529cb92e688af976dc8b639403d48976.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;85f0c1bd88b9021cd2f432a75cd07f33;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/85f0c1bd88b9021cd2f432a75cd07f33.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;28c32d4437e74798c9f591abcfe2afaf;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/28c32d4437e74798c9f591abcfe2afaf.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;5ddcf2ffd78c66568eb6383b459737a9;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/5ddcf2ffd78c66568eb6383b459737a9.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;96d11e3f4fcc9c7535e96de708dbc1a8;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/96d11e3f4fcc9c7535e96de708dbc1a8.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;51ab09564ef79215bc28c6e85cd66c4b;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/51ab09564ef79215bc28c6e85cd66c4b.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;690840ccbe6191a4d20f187da8538c2c;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/690840ccbe6191a4d20f187da8538c2c.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;aad54cf9568b1932027a492aee53bba1;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/aad54cf9568b1932027a492aee53bba1.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;454f44f1c41873ee27e6d7862764f11c;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/454f44f1c41873ee27e6d7862764f11c.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;6baa5666abfbe500b26c7ee91c4fe187;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/6baa5666abfbe500b26c7ee91c4fe187.jpg"
     * },
     * {
     * "fileType": 1,
     * "url":
     * "/images/product/2/4239/0/2/2/102576;bb05089710735a6757f1f2cf43c1d12e;jpg/laguna_suite.jpg",
     * "urlFull":
     * "https://media.dev.paximum.com/hotelimages/102576/bb05089710735a6757f1f2cf43c1d12e.jpg"
     * }
     * ]
     * }
     * ],
     * "address": {
     * "city": {
     * "name": "Antalya",
     * "provider": 0,
     * "isTopRegion": false,
     * "ownLocation": false
     * },
     * "addressLines": [
     * "Teomanpaşa Cad. 53",
     * "Antalya"
     * ],
     * "street": "Teomanpaşa Cad.",
     * "streetNumber": "53",
     * "geolocation": {
     * "longitude": "30.68731",
     * "latitude": "36.88774"
     * }
     * },
     * "faxNumber": "+902422476818",
     * "phoneNumber": "+902422433436",
     * "homePage": "http://www.suitelaguna.com/tr",
     * "stopSaleGuaranteed": 0,
     * "stopSaleStandart": 0,
     * "handicaps": [],
     * "geolocation": {
     * "longitude": "30.68731",
     * "latitude": "36.88774"
     * },
     * "stars": 3,
     * "rating": 4.2,
     * "themes": [
     * {
     * "id": "31",
     * "name": "City Hotel"
     * }
     * ],
     * "location": {
     * "name": "Antalya",
     * "latitude": "36.87536",
     * "longitude": "30.70838",
     * "provider": 2,
     * "isTopRegion": false,
     * "ownLocation": false,
     * "id": "23494"
     * },
     * "country": {
     * "name": "Turkey",
     * "provider": 0,
     * "isTopRegion": false,
     * "ownLocation": false,
     * "id": "TR"
     * },
     * "city": {
     * "name": "Antalya",
     * "latitude": "36.87536",
     * "longitude": "30.70838",
     * "provider": 2,
     * "isTopRegion": false,
     * "ownLocation": false,
     * "id": "23494"
     * },
     * "giataInfo": {
     * "hotelId": "62152",
     * "destinationId": "930"
     * },
     * "hotelCategory": {
     * "name": "3",
     * "id": "3",
     * "code": "3"
     * },
     * "hasChannelManagerOffer": false,
     * "provider": 2,
     * "thumbnail":
     * "/images/product/2/4239/0/2/2/102576;80b3e329100e6cb8ca6012f29607f1f3;jpg/laguna_suite.jpg",
     * "thumbnailFull":
     * "https://media.dev.paximum.com/hotelimages/102576/80b3e329100e6cb8ca6012f29607f1f3.jpg",
     * "description": {
     * "text":
     * "This apartment-complex is situated around 1 km from the beach and the town centre with numerous shops and entertainment venues. Public transport stops are right by the building and Antalya Airport is located 15 km away from the hotel.Renovated in 2006, this complex features a pleasant garden and a total of 7 floors with 64 apartments. Guests may make use of the foyer with 24-hour reception desk, a safe, a currency exchange and a lift as well as air conditioning throughout. Further facilities include an air-conditioned restaurant, a WLAN Internet terminal as well as a car park.The welcoming rooms come with a bathroom, a direct dial telephone, TV, kitchenette, minibar, individually regulated air conditioning, combined living and bed room, a separate bedroom with a double bed and a balcony.The apartment hotel offers its guests use of a swimming pool, a children's pool, a snack/ pool bar and a sun terrace with sun beds and parasols laid out ready for use. It is possible to play table tennis.Guests are offered breakfast and evening meals in the form of a buffet.American Express, MasterCard and VISA are accepted as methods of payment."
     * },
     * "id": "102576",
     * "name": "Laguna Suite"
     * }
     * }
     * 
     */
    private Hotels hotel;

}
