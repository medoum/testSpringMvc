package com.katakuri.web.service;

import com.katakuri.web.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();

}
