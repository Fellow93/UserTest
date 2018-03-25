/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.resttest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SingleResource {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("year")
@Expose
private Integer year;
@SerializedName("color")
@Expose
private String color;
@SerializedName("pantone_value")
@Expose
private String pantoneValue;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Integer getYear() {
return year;
}

public void setYear(Integer year) {
this.year = year;
}

public String getColor() {
return color;
}

public void setColor(String color) {
this.color = color;
}

public String getPantoneValue() {
return pantoneValue;
}

public void setPantoneValue(String pantoneValue) {
this.pantoneValue = pantoneValue;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("id", id).append("name", name).append("year", year).append("color", color).append("pantoneValue", pantoneValue).toString();
}

}
