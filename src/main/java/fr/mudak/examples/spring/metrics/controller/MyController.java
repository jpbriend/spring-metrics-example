package fr.mudak.examples.spring.metrics.controller;

import com.codahale.metrics.annotation.Timed;
import fr.mudak.examples.spring.metrics.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    private MyService myService;

    @Timed(name = "getAll")
    @RequestMapping(method=RequestMethod.GET, value = "/")
    @ResponseBody
    public String getAll(@RequestParam java.util.Map<String,String> allRequestParams, ModelMap model) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ioe) {}
        return myService.getAllData().toString();
    }

    @Timed(name = "getSingle")
    @RequestMapping(method= RequestMethod.GET, value = "/get")
    @ResponseBody
    public String getSingle(@RequestParam java.util.Map<String,String> allRequestParams, ModelMap model) {
        return myService.getMyData(Long.valueOf(allRequestParams.get("id"))).toString();

    }
}
