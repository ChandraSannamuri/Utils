
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
    "NO_OF_ROWS",
    "HAS_HORIZONTAL_SUB_CARDS",
    "HAS_SUB_CARD_LEFT_TO_RIGHT",
    "HI_PORT_START",
    "LO_PORT_START",
    "CARD_HEIGHT",
    "ROW_POSITIONING"
})
public class CardPhysicalLayout {

    @JsonProperty("NO_OF_ROWS")
    private NoOfRows noOfRows;
    @JsonProperty("HAS_HORIZONTAL_SUB_CARDS")
    private HasHorizontalSubCards hasHorizontalSubCards;
    @JsonProperty("HAS_SUB_CARD_LEFT_TO_RIGHT")
    private HasSubCardLeftToRight hasSubCardLeftToRight;
    @JsonProperty("HI_PORT_START")
    private HiPortStart hiPortStart;
    @JsonProperty("LO_PORT_START")
    private LoPortStart loPortStart;
    @JsonProperty("CARD_HEIGHT")
    private CardHeight cardHeight;
    @JsonProperty("ROW_POSITIONING")
    private RowPositioning rowPositioning;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("NO_OF_ROWS")
    public NoOfRows getNoOfRows() {
        return noOfRows;
    }

    @JsonProperty("NO_OF_ROWS")
    public void setNoOfRows(NoOfRows noOfRows) {
        this.noOfRows = noOfRows;
    }

    @JsonProperty("HAS_HORIZONTAL_SUB_CARDS")
    public HasHorizontalSubCards getHasHorizontalSubCards() {
        return hasHorizontalSubCards;
    }

    @JsonProperty("HAS_HORIZONTAL_SUB_CARDS")
    public void setHasHorizontalSubCards(HasHorizontalSubCards hasHorizontalSubCards) {
        this.hasHorizontalSubCards = hasHorizontalSubCards;
    }

    @JsonProperty("HAS_SUB_CARD_LEFT_TO_RIGHT")
    public HasSubCardLeftToRight getHasSubCardLeftToRight() {
        return hasSubCardLeftToRight;
    }

    @JsonProperty("HAS_SUB_CARD_LEFT_TO_RIGHT")
    public void setHasSubCardLeftToRight(HasSubCardLeftToRight hasSubCardLeftToRight) {
        this.hasSubCardLeftToRight = hasSubCardLeftToRight;
    }

    @JsonProperty("HI_PORT_START")
    public HiPortStart getHiPortStart() {
        return hiPortStart;
    }

    @JsonProperty("HI_PORT_START")
    public void setHiPortStart(HiPortStart hiPortStart) {
        this.hiPortStart = hiPortStart;
    }

    @JsonProperty("LO_PORT_START")
    public LoPortStart getLoPortStart() {
        return loPortStart;
    }

    @JsonProperty("LO_PORT_START")
    public void setLoPortStart(LoPortStart loPortStart) {
        this.loPortStart = loPortStart;
    }

    @JsonProperty("CARD_HEIGHT")
    public CardHeight getCardHeight() {
        return cardHeight;
    }

    @JsonProperty("CARD_HEIGHT")
    public void setCardHeight(CardHeight cardHeight) {
        this.cardHeight = cardHeight;
    }

    @JsonProperty("ROW_POSITIONING")
    public RowPositioning getRowPositioning() {
        return rowPositioning;
    }

    @JsonProperty("ROW_POSITIONING")
    public void setRowPositioning(RowPositioning rowPositioning) {
        this.rowPositioning = rowPositioning;
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
