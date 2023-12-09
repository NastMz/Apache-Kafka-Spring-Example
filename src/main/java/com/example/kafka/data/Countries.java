package com.example.kafka.data;

public enum Countries {
    USA("United States of America"),
    CAN("Canada"),
    MEX("Mexico"),
    COL("Colombia"),
    BRA("Brazil"),
    PER("Peru"),
    CHL("Chile"),
    ARG("Argentina"),
    ECU("Ecuador"),
    BOL("Bolivia"),
    PRY("Paraguay"),
    URY("Uruguay"),
    GUY("Guyana"),
    SUR("Suriname"),
    GUF("French Guiana"),
    VEN("Venezuela"),
    GBR("United Kingdom"),
    FRA("France"),
    ESP("Spain"),
    PRT("Portugal"),
    DEU("Germany"),
    ITA("Italy"),
    NLD("Netherlands"),
    BEL("Belgium"),
    LUX("Luxembourg"),
    IRL("Ireland"),
    DNK("Denmark"),
    NOR("Norway"),
    SWE("Sweden"),
    CHE("Switzerland");

    final String country;

    Countries(String country) {
        this.country = country;
    }
}
