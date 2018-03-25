/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.resttest;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Resources {

@SerializedName("page")
@Expose
private Integer page;
@SerializedName("per_page")
@Expose
private Integer perPage;
@SerializedName("total")
@Expose
private Integer total;
@SerializedName("total_pages")
@Expose
private Integer totalPages;
@SerializedName("data")
@Expose
private List<SingleResource> data = null;

public Integer getPage() {
return page;
}

public void setPage(Integer page) {
this.page = page;
}

public Integer getPerPage() {
return perPage;
}

public void setPerPage(Integer perPage) {
this.perPage = perPage;
}

public Integer getTotal() {
return total;
}

public void setTotal(Integer total) {
this.total = total;
}

public Integer getTotalPages() {
return totalPages;
}

public void setTotalPages(Integer totalPages) {
this.totalPages = totalPages;
}

public List<SingleResource> getData() {
return data;
}

public void setData(List<SingleResource> data) {
this.data = data;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("page", page).append("perPage", perPage).append("total", total).append("totalPages", totalPages).append("data", data).toString();
}

}