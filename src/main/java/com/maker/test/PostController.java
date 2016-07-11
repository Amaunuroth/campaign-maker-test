package com.maker.test;

import com.maker.test.models.Area;
import com.maker.test.exceptions.*;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by aemmet on 6/29/16.
 */
@RestController
@RequestMapping("/posts")
public class PostController {

    @Secured("ROLE_USER")
    @RequestMapping("/list")
    public String list() {
        return "lists posts...";
    }


    @Secured("ROLE_USER")
    @RequestMapping(value = "/derp", method = RequestMethod.GET)
    @ResponseBody
    public String viewDerp() throws DataNotFoundException {
//        return "HELLO WORLD";
        throw new DataNotFoundException("we don't have anything sucker!");
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/derp", method = RequestMethod.POST)
    public String addDerp() {
        return "add posts";
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(value = "/derp", method = RequestMethod.DELETE)
    public String deleteDerp() {
        return "delete posts";
    }

    public Iterable<Area> posts()
    {
        return null;
    }

    @Secured("ROLE_GUEST")
    @RequestMapping("/view")
    public String view() {
        return "view drafts.";
    }

    @ExceptionHandler
    void handleIllegalArgumentException(DataNotFoundException e, HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }
}
