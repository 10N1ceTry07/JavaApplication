package ua.lviv.iot.spring.labseven.rest.RestAplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.lviv.iot.spring.labseven.business.*;
import ua.lviv.iot.spring.labseven.rest.RestAplication.model.*;

@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    public List<Group> getAllGroups() {
        return groupService.findAll();
    }
}



