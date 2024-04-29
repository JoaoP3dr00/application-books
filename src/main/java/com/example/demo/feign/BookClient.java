package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 *
 */
@FeignClient(name = "book-api", url = "https://drive.google.com/file/d/16LQTSDG3mAv0aQzQDBTp3itLHu5UDObh/view?usp=sharing")
public interface BookClient {

}
