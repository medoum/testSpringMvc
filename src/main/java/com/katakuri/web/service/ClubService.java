package com.katakuri.web.service;

import com.katakuri.web.dto.ClubDto;
import com.katakuri.web.model.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
    Club saveClub(ClubDto clubDto);

    ClubDto findClubById(long clubId);

    void updateClub(ClubDto clubDto);
}
