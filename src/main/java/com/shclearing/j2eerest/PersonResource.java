package com.shclearing.j2eerest;

import com.shclearing.model.Person;
import com.shclearing.page.PaginatedListWrapper;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * User: changejava
 * Date: 2015/1/13
 * Time: 22:08
 */
@Stateless
@ApplicationPath("/resources")
@Path("persons")
public class PersonResource extends Application {

  @PersistenceContext
  private EntityManager entityManager;

  private Integer count() {
    Query query = entityManager.createQuery("select count (p.id) from Person as p ");
    return ((Long) query.getSingleResult()).intValue();
  }

  public List findPersons(int startPosition, int maxResult, String sortFields, String sortDirections) {
    Query query = entityManager.createQuery("select p from Person  as p order by " + sortFields + " " + sortDirections, Person.class);
    query.setFirstResult(startPosition);
    query.setMaxResults(maxResult);
    return query.getResultList();
  }


  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public PaginatedListWrapper<Person> listPersons(@DefaultValue("1") @QueryParam("page") Integer page,
                                                  @DefaultValue("id") @QueryParam("sortFields") String sortFields,
                                                  @DefaultValue("desc") @QueryParam("sortDirections") String sortDirections) {
    PaginatedListWrapper<Person> paginateListWapper = new PaginatedListWrapper<Person>();
    paginateListWapper.setCurrentPage(page);
    paginateListWapper.setSortFields(sortFields);
    paginateListWapper.setSortDirections(sortDirections);
    paginateListWapper.setPageSize(10);
    return findPersons(paginateListWapper);

  }

  private PaginatedListWrapper<Person> findPersons(PaginatedListWrapper<Person> wrapper) {
    wrapper.setTotalResults(count());
    int start = (wrapper.getCurrentPage() - 1) * wrapper.getPageSize();
    wrapper.setList(findPersons(start, wrapper.getPageSize(), wrapper.getSortFields(), wrapper.getSortDirections()));
    return wrapper;
  }
}
