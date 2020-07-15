package com.codegym.service;

import com.codegym.model.Room;
import com.codegym.model.Villa;
import com.codegym.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomRepository roomRepository;

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public void save(Room room) {
        roomRepository.save(room);
    }

    @Override
    public Room findById(Integer id) {
        return roomRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        roomRepository.deleteById(id);
    }
}
