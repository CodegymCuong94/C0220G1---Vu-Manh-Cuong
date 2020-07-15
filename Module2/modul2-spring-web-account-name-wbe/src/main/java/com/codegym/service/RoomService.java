package com.codegym.service;

import com.codegym.model.Room;
import com.codegym.model.Villa;

import java.util.List;

public interface RoomService {
    //    Page<Room> findAllPage(Pageable pageable);
    List<Room> findAll();

    void save(Room room);

    Room findById(Integer id);

//    Page<Room> findByLastNameContaining(String keyword, Pageable pageable);

    void deleteById(Integer id);
}
