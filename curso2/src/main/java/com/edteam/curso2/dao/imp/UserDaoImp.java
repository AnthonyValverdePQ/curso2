package com.edteam.curso2.dao.imp;

import com.edteam.curso2.dao.UserDao;
import com.edteam.curso2.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional
@Repository
public class UserDaoImp implements UserDao {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<User> getAll(){
        String hql="From User as u";
        return (List<User>) entityManager.createQuery(hql).getResultList();

    }

    @Transactional
    @Override
    public User get(long id){
      return  entityManager.find(User.class,id);

    }

    @Transactional
    @Override
    public User register(User user){
        entityManager.merge(user);
        return user;
    }

    @Transactional
    @Override
    public User update(User user){
        entityManager.merge(user);
        return user;
    }

    @Transactional
    @Override
    public void delete(long id){
        User user= get(id);
    entityManager.remove(user);
    }
}
