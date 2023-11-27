package com.hae.configexample.service.query;

import com.hae.configexample.dto.query.in.BusinessQueryInDto;
import com.hae.configexample.dto.query.out.BusinessQueryOutDto;
import com.hae.configexample.entity.Business;
import com.hae.configexample.exception.NotFoundException;
import com.hae.configexample.mapper.v1.BusinessMapper;
import com.hae.configexample.repository.BusinessRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BusinessQueryServiceImpl implements BusinessQueryService{
    //repository
    private final BusinessRepository businessRepository;

    //mapper
    private final BusinessMapper businessMapper = BusinessMapper.INSTANCE;


    @Override
    public BusinessQueryOutDto findBusinessById(String id) throws NotFoundException {
        return businessMapper.toBusinessQueryOutDto(businessRepository.findById(id)
                .orElseThrow(()->new NotFoundException("Business")));
    }

    @Override
    public List<BusinessQueryOutDto> findAll(BusinessQueryInDto businessQueryInDto) {
        String code = businessQueryInDto.getCode();

        List<Business> businessList = businessRepository.findAllByCode(code);

        return businessMapper.toBusinessQueryOutDtoList(businessList);
    }
}
