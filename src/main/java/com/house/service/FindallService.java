package com.house.service;

import com.house.domain.*;

import java.util.List;

public interface FindallService {
    public List<Tfrecord> findtfr();
    public List<Htrecord> findhtr();
    public List<Qtrecord> findqtr();
    public List<Recieved> findrec();
    public List<Roster> findros();
    public List<User> finduser();
    public List<Waiting> findwait();
    public List<Wxrecord> findwxr();
    public List<Lottery> findlot();
    public List<Roster> findhtdq();
}
