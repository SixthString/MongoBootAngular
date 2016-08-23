package org.mba.controllers; /**
 * Created by one on 8/18/16.
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

    @Controller
    public class FirstController {

        @RequestMapping("/")
        String home() {
            return "index";
        }


    }


