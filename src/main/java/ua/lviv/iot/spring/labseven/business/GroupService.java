package ua.lviv.iot.spring.labseven.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ua.lviv.iot.spring.labseven.data.*;
import ua.lviv.iot.spring.labseven.rest.RestAplication.model.*;

public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public List<Group> findAll() {
        return groupRepository.findAll();
    }

}
