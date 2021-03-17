package com.mulikevs.test.sbet.landon.roomwebapp.service;

import java.util.List;

import com.mulikevs.test.sbet.landon.roomwebapp.data.StaffRepository;
import com.mulikevs.test.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}