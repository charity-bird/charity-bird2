package org.app.Index;

import org.app.Util.*;
import spark.*;
import java.util.*;
import static org.app.Application.*;

public class IndexController {
    public static Route serveIndexPage = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        model.put("users", userDao.getAllUserNames());
        model.put("book", bookDao.getRandomBook());
        return ViewUtil.render(request, model, Path.Template.INDEX);
    };
}
