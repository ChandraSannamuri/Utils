
package com.demo.vo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "class",
    "parent-rel-pos",
    "permitted-child-type"
})
@Generated("jsonschema2pojo")
public class Value__4 {

    @JsonProperty("class")
    private Class _class;
    @JsonProperty("parent-rel-pos")
    private ParentRelPos parentRelPos;
    @JsonProperty("permitted-child-type")
    private PermittedChildType permittedChildType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("class")
    public Class getClass_() {
        return _class;
    }

    @JsonProperty("class")
    public void setClass_(Class _class) {
        this._class = _class;
    }

    @JsonProperty("parent-rel-pos")
    public ParentRelPos getParentRelPos() {
        return parentRelPos;
    }

    @JsonProperty("parent-rel-pos")
    public void setParentRelPos(ParentRelPos parentRelPos) {
        this.parentRelPos = parentRelPos;
    }

    @JsonProperty("permitted-child-type")
    public PermittedChildType getPermittedChildType() {
        return permittedChildType;
    }

    @JsonProperty("permitted-child-type")
    public void setPermittedChildType(PermittedChildType permittedChildType) {
        this.permittedChildType = permittedChildType;
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
