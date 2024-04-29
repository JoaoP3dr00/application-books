package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookController class that controlls all requests
 *
 * For spring recognize this class as a real controller it's needed to add the
 * tag @RestController. (@ is used to add metadata to classes, methods and variables)
 * We also add the tag @RequestMapping() to specify al endpoints that this controller deals.
 *
 */
@RestController
@RequestMapping("/api/books")
public class BookController {
    /**
     * Method getBooks...
     */
    @GetMapping()   // This tag can receive a param like ("/{id}") if we need an url like /api/books/{id} and our method must receive @ParamVariable String id, and then spring will get the id from url and inject here.
    public String getBooks(){
        return "oi";
    }
}
