package org.app.Book;

import org.app.Login.*;
import org.app.Util.*;
import spark.*;
import java.util.*;

import static app.util.RequestUtil.*;
import static org.app.Util.JsonUtil.*;
import static org.app.Application.bookDao;

public class BookController {

    public static Route fetchAllBooks = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            model.put("books", bookDao.getAllBooks());
            return ViewUtil.render(request, model, Path.Template.BOOKS_ALL);
        }
        if (clientAcceptsJson(request)) {
            return dataToJson(bookDao.getAllBooks());
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };

    public static Route fetchOneBook = (Request request, Response response) -> {
        LoginController.ensureUserIsLoggedIn(request, response);
        if (clientAcceptsHtml(request)) {
            HashMap<String, Object> model = new HashMap<>();
            Book book = bookDao.getBookByIsbn(getParamIsbn(request));
            model.put("book", book);
            return ViewUtil.render(request, model, Path.Template.BOOKS_ONE);
        }
        if (clientAcceptsJson(request)) {
            return dataToJson(bookDao.getBookByIsbn(getParamIsbn(request)));
        }
        return ViewUtil.notAcceptable.handle(request, response);
    };
}
