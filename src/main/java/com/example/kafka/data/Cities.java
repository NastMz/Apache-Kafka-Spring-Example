package com.example.kafka.data;


public enum Cities {
    LONDON("London", Countries.GBR.country),
    PARIS("Paris", Countries.FRA.country),
    NEW_YORK("New York", Countries.USA.country),
    MADRID("Madrid", Countries.ESP.country),
    BERLIN("Berlin", Countries.DEU.country),
    ROME("Rome", Countries.ITA.country),
    AMSTERDAM("Amsterdam", Countries.NLD.country),
    BRUSSELS("Brussels", Countries.BEL.country),
    DUBLIN("Dublin", Countries.IRL.country),
    COPENHAGEN("Copenhagen", Countries.DNK.country),
    OSLO("Oslo", Countries.NOR.country),
    STOCKHOLM("Stockholm", Countries.SWE.country),
    OTTAWA("Ottawa", Countries.CAN.country),
    MEXICO_CITY("Mexico City", Countries.MEX.country),
    BOGOTA("Bogota", Countries.COL.country),
    BRASILIA("Brasilia", Countries.BRA.country),
    LIMA("Lima", Countries.PER.country),
    SANTIAGO("Santiago", Countries.CHL.country),
    BUENOS_AIRES("Buenos Aires", Countries.ARG.country),
    QUITO("Quito", Countries.ECU.country),
    LA_PAZ("La Paz", Countries.BOL.country),
    ASUNCION("Asuncion", Countries.PRY.country),
    MONTEVIDEO("Montevideo", Countries.URY.country),
    GEORGETOWN("Georgetown", Countries.GUY.country),
    PARAMARIBO("Paramaribo", Countries.SUR.country),
    CAYENNE("Cayenne", Countries.GUF.country),
    CARACAS("Caracas", Countries.VEN.country),
    WASHINGTON_DC("Washington D.C.", Countries.USA.country),
    LOS_ANGELES("Los Angeles", Countries.USA.country),
    CHICAGO("Chicago", Countries.USA.country),
    HOUSTON("Houston", Countries.USA.country),
    LISBON("Lisbon", Countries.PRT.country),
    LUXEMBOURG("Luxembourg", Countries.LUX.country),
    GENEVA("Geneva", Countries.CHE.country),
    ZURICH("Zurich", Countries.CHE.country),
    MEDELLIN("Medellin", Countries.COL.country),
    CALI("Cali", Countries.COL.country),
    BARRANQUILLA("Barranquilla", Countries.COL.country),
    MANAUS("Manaus", Countries.BRA.country),
    PORTO_ALEGRE("Porto Alegre", Countries.BRA.country),
    RECIFE("Recife", Countries.BRA.country),
    SALVADOR("Salvador", Countries.BRA.country),
    FORTALEZA("Fortaleza", Countries.BRA.country),
    SAO_PAULO("Sao Paulo", Countries.BRA.country),
    BARCELONA("Barcelona", Countries.ESP.country),
    VALENCIA("Valencia", Countries.ESP.country),
    SEVILLE("Seville", Countries.ESP.country),
    BILBAO("Bilbao", Countries.ESP.country);

    final String city;
    final String Country;

    Cities(String city, String Country) {
        this.city = city;
        this.Country = Country;
    }
}
