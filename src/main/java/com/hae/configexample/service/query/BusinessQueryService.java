package com.hae.configexample.service.query;

import com.hae.configexample.dto.query.in.BusinessQueryInDto;
import com.hae.configexample.dto.query.out.BusinessQueryOutDto;
import com.hae.configexample.exception.NotFoundException;

import java.util.List;

public interface BusinessQueryService {

    BusinessQueryOutDto findBusinessById(String code) throws NotFoundException;
    List<BusinessQueryOutDto> findAll(BusinessQueryInDto businessQueryInDto);
}
