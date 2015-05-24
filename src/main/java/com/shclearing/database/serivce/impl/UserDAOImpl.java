package com.shclearing.database.serivce.impl;

import com.shclearing.database.mappers.User;
import com.shclearing.database.serivce.UserDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by change on 5/24/15.
 */
@Service
public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO {


    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @PostConstruct
    public void setDataSource(){
        setSqlSessionFactory(sqlSessionFactory);
        setSqlSessionTemplate(sqlSessionTemplate);
    }
    @Override
    public int saveUser(User user) {
        SqlSession sqlSession = this.getSqlSession();
        try {
            return sqlSession.insert("addUser", user);
        } finally {
//            sqlSession.close();
        }
    }

    @Override
    public int deleteUser(int userID) {
        SqlSession sqlSession = this.getSqlSession();
        try {
            return sqlSession.delete("deleteUser", userID);
        }finally {
//            sqlSession.close();
        }
    }

    @Override
    public int updateUser(User user) {
        SqlSession sqlSession = this.getSqlSession();
        try {
            return sqlSession.update("updateUser",user);
        }finally {
//            sqlSession.close();
        }
    }

    @Override
    public User searchUsers(int userId) {
        SqlSession sqlSession = this.getSqlSession();
        try {
            return sqlSession.selectOne("selectUser",userId);
        }finally {
//            sqlSession.close();
        }
    }
}
