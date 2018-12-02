package edu.poly.controller;

import edu.poly.common.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(Constants.Url.MANAGEMENT_URL)
public class ManagementController {

    public static final String INDEX_SCREEN = "index";

    public static final String INFOMATION_SCREEN = "infomation";
}
