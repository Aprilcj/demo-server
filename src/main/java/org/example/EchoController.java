package org.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
  @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
  public String echo(@PathVariable String string) {
    return "Hello CP demo " + string;
  }
}