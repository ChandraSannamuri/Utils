
package com.demo.vo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CARD_STATUS",
    "PHYSICAL_MODELLING_REQUIRED",
    "CAN_BE_GHOST",
    "TX_BEARER_FLAG",
    "DCN_FLAG",
    "NO_TS_PORTS",
    "STARTING_PORT_NO",
    "AAS_PORT_TYPE",
    "PROTECTION_TYPES",
    "PRICE_REQUIRED",
    "SALEABLE_ENTITY_DETAILS"
})
public class CardLogicalAttributes {

    @JsonProperty("CARD_STATUS")
    private CardStatus cardStatus;
    @JsonProperty("PHYSICAL_MODELLING_REQUIRED")
    private PhysicalModellingRequired physicalModellingRequired;
    @JsonProperty("CAN_BE_GHOST")
    private CanBeGhost canBeGhost;
    @JsonProperty("TX_BEARER_FLAG")
    private TxBearerFlag txBearerFlag;
    @JsonProperty("DCN_FLAG")
    private DcnFlag dcnFlag;
    @JsonProperty("NO_TS_PORTS")
    private NoTsPorts noTsPorts;
    @JsonProperty("STARTING_PORT_NO")
    private StartingPortNo startingPortNo;
    @JsonProperty("AAS_PORT_TYPE")
    private AasPortType aasPortType;
    @JsonProperty("PROTECTION_TYPES")
    private ProtectionTypes protectionTypes;
    @JsonProperty("PRICE_REQUIRED")
    private PriceRequired priceRequired;
    @JsonProperty("SALEABLE_ENTITY_DETAILS")
    private SaleableEntityDetails saleableEntityDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CARD_STATUS")
    public CardStatus getCardStatus() {
        return cardStatus;
    }

    @JsonProperty("CARD_STATUS")
    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    @JsonProperty("PHYSICAL_MODELLING_REQUIRED")
    public PhysicalModellingRequired getPhysicalModellingRequired() {
        return physicalModellingRequired;
    }

    @JsonProperty("PHYSICAL_MODELLING_REQUIRED")
    public void setPhysicalModellingRequired(PhysicalModellingRequired physicalModellingRequired) {
        this.physicalModellingRequired = physicalModellingRequired;
    }

    @JsonProperty("CAN_BE_GHOST")
    public CanBeGhost getCanBeGhost() {
        return canBeGhost;
    }

    @JsonProperty("CAN_BE_GHOST")
    public void setCanBeGhost(CanBeGhost canBeGhost) {
        this.canBeGhost = canBeGhost;
    }

    @JsonProperty("TX_BEARER_FLAG")
    public TxBearerFlag getTxBearerFlag() {
        return txBearerFlag;
    }

    @JsonProperty("TX_BEARER_FLAG")
    public void setTxBearerFlag(TxBearerFlag txBearerFlag) {
        this.txBearerFlag = txBearerFlag;
    }

    @JsonProperty("DCN_FLAG")
    public DcnFlag getDcnFlag() {
        return dcnFlag;
    }

    @JsonProperty("DCN_FLAG")
    public void setDcnFlag(DcnFlag dcnFlag) {
        this.dcnFlag = dcnFlag;
    }

    @JsonProperty("NO_TS_PORTS")
    public NoTsPorts getNoTsPorts() {
        return noTsPorts;
    }

    @JsonProperty("NO_TS_PORTS")
    public void setNoTsPorts(NoTsPorts noTsPorts) {
        this.noTsPorts = noTsPorts;
    }

    @JsonProperty("STARTING_PORT_NO")
    public StartingPortNo getStartingPortNo() {
        return startingPortNo;
    }

    @JsonProperty("STARTING_PORT_NO")
    public void setStartingPortNo(StartingPortNo startingPortNo) {
        this.startingPortNo = startingPortNo;
    }

    @JsonProperty("AAS_PORT_TYPE")
    public AasPortType getAasPortType() {
        return aasPortType;
    }

    @JsonProperty("AAS_PORT_TYPE")
    public void setAasPortType(AasPortType aasPortType) {
        this.aasPortType = aasPortType;
    }

    @JsonProperty("PROTECTION_TYPES")
    public ProtectionTypes getProtectionTypes() {
        return protectionTypes;
    }

    @JsonProperty("PROTECTION_TYPES")
    public void setProtectionTypes(ProtectionTypes protectionTypes) {
        this.protectionTypes = protectionTypes;
    }

    @JsonProperty("PRICE_REQUIRED")
    public PriceRequired getPriceRequired() {
        return priceRequired;
    }

    @JsonProperty("PRICE_REQUIRED")
    public void setPriceRequired(PriceRequired priceRequired) {
        this.priceRequired = priceRequired;
    }

    @JsonProperty("SALEABLE_ENTITY_DETAILS")
    public SaleableEntityDetails getSaleableEntityDetails() {
        return saleableEntityDetails;
    }

    @JsonProperty("SALEABLE_ENTITY_DETAILS")
    public void setSaleableEntityDetails(SaleableEntityDetails saleableEntityDetails) {
        this.saleableEntityDetails = saleableEntityDetails;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
