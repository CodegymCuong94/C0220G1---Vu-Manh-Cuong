package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository(value = "blogReport")
@Transactional
public class BlogRepositoryImpl implements BlogRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Blog> findAll() {

        TypedQuery<Blog> typedQuery = entityManager.createQuery("select b from Blog b", Blog.class);
        return typedQuery.getResultList();
    }

    @Override
    public void save(Blog blog) {
        entityManager.persist(blog);
    }

    @Override
    public Blog findById(int id) {
        TypedQuery<Blog> typedQuery = entityManager.createQuery("select b from Blog b where b.id = :id", Blog.class);
        typedQuery.setParameter("id", id);
        return typedQuery.getSingleResult();
    }


//    @Override
//    public void update(int id, Blog blog) {
//        blogs.put(id, blog);
//    }
//
//    @Override
//    public void remove(int id) {
//        blogs.remove(id);
//    }
}
