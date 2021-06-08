package pl.edu.agh.soa.dao;

import pl.edu.agh.model.Club;
import pl.edu.agh.soa.entities.ClubEntity;
import pl.edu.agh.soa.mappers.ClubsMapper;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class ClubsDAO {

    @PersistenceContext(unitName = "studentsThis")
    EntityManager em;

    public List<Club> getAllClubs() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<ClubEntity> criteriaQuery = builder.createQuery(ClubEntity.class);
        Root<ClubEntity> root = criteriaQuery.from(ClubEntity.class);
        criteriaQuery.select(root);
        TypedQuery<ClubEntity> query = em.createQuery(criteriaQuery);
        List<ClubEntity> resultList = query.getResultList();
        if(resultList == null)
            return null;
        return resultList.stream().map(ClubsMapper::entityToModel).collect(Collectors.toList());
    }




}
