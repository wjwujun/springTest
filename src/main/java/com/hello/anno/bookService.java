package com.hello.anno;


import javax.annotation.Resource;

public class bookService {
        @Resource(name = "bookDao")
        private  BookDao bookDao;

        @Resource(name = "orderDao")
        private OrderDao orderDao;

        public void add(){

            System.out.println("BookDao.............");

            bookDao.book();
            orderDao.buy();
        }

}
