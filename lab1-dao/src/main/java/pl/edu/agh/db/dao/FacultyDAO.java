package pl.edu.agh.db.dao;

import pl.edu.agh.model.Faculty;
import pl.edu.agh.db.entities.FacultyEntity;
import pl.edu.agh.db.mappers.FacultiesMapper;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class FacultyDAO {

    @PersistenceContext(unitName = "students")
    EntityManager em;

    public List<Faculty> getAllFaculties() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<FacultyEntity> criteriaQuery = builder.createQuery(FacultyEntity.class);
        Root<FacultyEntity> root = criteriaQuery.from(FacultyEntity.class);
        criteriaQuery.select(root);
        TypedQuery<FacultyEntity> query = em.createQuery(criteriaQuery);
        List<FacultyEntity> resultList = query.getResultList();
        if(resultList == null)
            return null;
        return resultList.stream().map(FacultiesMapper::entityToModel).collect(Collectors.toList());
    }




}
