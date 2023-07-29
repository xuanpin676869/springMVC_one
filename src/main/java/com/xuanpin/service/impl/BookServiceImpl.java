package com.xuanpin.service.impl;

import com.xuanpin.controller.WebServiceStatusCode;
import com.xuanpin.dao.BookDao;
import com.xuanpin.domain.Book;
import com.xuanpin.exception.BusinessException;
import com.xuanpin.exception.SystemException;
import com.xuanpin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {
        if(id == 1){
            throw new BusinessException(WebServiceStatusCode.PROJECT_BUSINESS_ERROR,"请输入正确的内容");
        }
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
