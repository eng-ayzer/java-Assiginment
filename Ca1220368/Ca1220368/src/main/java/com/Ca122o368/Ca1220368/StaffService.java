package com.Ca122o368.Ca1220368;

import com.Ca122o368.Ca1220368.Staff;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StaffService {

    private final Map<Long, Staff> staffMap = new HashMap<>();
    private Long nextId = 1L;

    public List<Staff> getAllStaff() {
        return new ArrayList<>(staffMap.values());
    }

    public Staff getStaffById(Long id) {
        return staffMap.get(id);
    }

    public Staff createStaff(Staff staff) {
        staff.setId(nextId++);
        staffMap.put(staff.getId(), staff);
        return staff;
    }

    public Staff updateStaff(Long id, Staff updatedStaff) {
        updatedStaff.setId(id);
        staffMap.put(id, updatedStaff);
        return updatedStaff;
    }

    public boolean deleteStaff(Long id) {
        return staffMap.remove(id) != null;
    }
}

