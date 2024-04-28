package org.boot.rest;

import org.boot.entities.Address;
import org.boot.entities.Shipping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ship")
public class ShippingRestController {
    @GetMapping
    public Shipping getShipping() {
        return new Shipping("1",new Address("Nasr City","Cairo","Almofty"),1,true);
    }

    @PostMapping
    public String postShipping(@RequestBody Shipping shipping) {
        System.out.println(shipping);
        return "success";
    }
}