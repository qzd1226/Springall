package com.impl;

import com.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.BookService;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    @Override
    // readOnly: 只读 用于查询时设置为true
    // timeout: 限制时间，超过时间异常跳出，强制回滚
    // rollBackFor : 因为什么而回滚
    // noRollBackFor: 不因为什么而回滚
    @Transactional(readOnly = false, timeout = 3) // 加入事务管理
    public void buyBook(Integer userId, Integer bookId) {
        //查询图书馆的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书的库存
        bookDao.updateStoke(bookId);
        //更新用户的余额
        bookDao.updateBalance(userId, price);
    }
}
