package pl.kafar.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostsController {

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String showPosts(Model model) {
        return "posts";
    }

    @RequestMapping(value ="/post1", method = RequestMethod.GET)
    public String showPost1(Model model) {
        return "post1";
    }

    @RequestMapping(value ="/post2", method = RequestMethod.GET)
    public String showPost2(Model model) {
        return "post2";
    }
}
