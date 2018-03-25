package com.mycompany.resttest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class User {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("first_name")
@Expose
private String firstName;
@SerializedName("last_name")
@Expose
private String lastName;
@SerializedName("avatar")
@Expose
private String avatar;
@SerializedName("createdAt")
@Expose
private String createdAt;
@SerializedName("updatedAt")
@Expose
private String updatedAt;

public String getCreatedAt() {
    return createdAt;
}

public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
}

public String getUpdatedAt() {
    return updatedAt;
}

public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getAvatar() {
return avatar;
}

public void setAvatar(String avatar) {
this.avatar = avatar;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("id", id).append("firstName", firstName).append("lastName", lastName).append("avatar", avatar)
        .append("createdAt", createdAt).append("updatedAt", updatedAt).toString();
}

}