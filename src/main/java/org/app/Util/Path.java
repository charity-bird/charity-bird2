package org.app.Util;

import lombok.*;
public class Path {

    public static class Web {
        @Getter public static final String INDEX = "/index/";
        @Getter public static final String LOGIN = "/login/";
        @Getter public static final String LOGOUT = "/logout/";
        @Getter public static final String BOOKS = "/books/";
        @Getter public static final String ONE_BOOK = "/books/:isbn/";
        @Getter public static final String DONATE = "/donate/";
        @Getter public static final String RECEIPT = "/receipt/";
    }

    public static class Template {
        public final static String INDEX = "/velocity/index/index.vm";
        public final static String LOGIN = "/velocity/login/login.vm";
        public final static String BOOKS_ALL = "/velocity/book/all.vm";
        public static final String BOOKS_ONE = "/velocity/book/one.vm";
        public static final String NOT_FOUND = "/velocity/notFound.vm";
        public static final String DONATE = "/velocity/donate/donate.vm";
        public static final String RECEIPT = "/velocity/donate/receipt.vm";
    }

}
