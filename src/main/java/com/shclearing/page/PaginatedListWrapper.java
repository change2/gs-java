package com.shclearing.page;

import java.util.List;

/**
 * User: changejava
 * Date: 2015/1/13
 * Time: 22:06
 */
public class PaginatedListWrapper<T> {

  private Integer currentPage;
  private Integer pageSize;
  private Integer totalResults;
  private List<T> list;
  private String sortFields;
  private String sortDirections;

  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Integer getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }

  public List<T> getList() {
    return list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }

  public String getSortFields() {
    return sortFields;
  }

  public void setSortFields(String sortFields) {
    this.sortFields = sortFields;
  }

  public String getSortDirections() {
    return sortDirections;
  }

  public void setSortDirections(String sortDirections) {
    this.sortDirections = sortDirections;
  }
}
