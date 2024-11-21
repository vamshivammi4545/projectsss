package com.shoppingmart.ecommerceClothing.Notifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noti")
public class NotiCOntroller {

    @Autowired
    private NotiRepo notiRepo;

    @PostMapping("/save")
    public Notification saveNotification(@RequestBody Notification notification){
return notiRepo.save(notification);
    }

}
