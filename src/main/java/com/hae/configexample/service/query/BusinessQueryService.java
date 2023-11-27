package com.hae.configexample.service.query;

import com.hae.configexample.dto.query.in.BusinessQueryInDto;
import com.hae.configexample.dto.query.out.BusinessQueryOutDto;

import java.util.List;

public interface BusinessQueryService {

    List<BusinessQueryOutDto> findAll(BusinessQueryInDto businessQueryInDto);
}
