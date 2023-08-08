package org.app.Donate;

import org.app.Util.Path;
import org.app.Util.ViewUtil;
import spark.Request;
import spark.Response;
import spark.Route;

import java.util.HashMap;
import java.util.Map;

import static app.util.RequestUtil.*;

public class DonateController {
    public static Route serveDonatePage = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        return ViewUtil.render(request, model, Path.Template.DONATE);
    };

    public static Route handleDonatePost = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        String firstName = getQueryFirstName(request);
        String lastName = getQueryLastName(request);
        String emailAddress = getQueryEmail(request);
        String phoneNumber = getQueryPhoneNumber(request);
        String postalCode = getQueryPostalCode(request);
        int amount = getQueryAmount(request);

        Donate donate = new Donate(firstName, lastName, emailAddress, phoneNumber, postalCode, amount);

        model.put("firstName", firstName);
        model.put("lastName", lastName);
        model.put("emailAddress", emailAddress);
        model.put("phoneNumber", phoneNumber);
        model.put("postalCode", postalCode);
        model.put("amount", amount);

        return ViewUtil.render(request, model, Path.Template.RECEIPT);
    };

    public static Route serveReceiptPage = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        return ViewUtil.render(request, model, Path.Template.RECEIPT);
    };
}
