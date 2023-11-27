package com.hae.configexample.mapper.v1;

import com.hae.configexample.dto.query.out.BusinessQueryOutDto;
import com.hae.configexample.entity.Business;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BusinessMapper {

    BusinessMapper INSTANCE = Mappers.getMapper(BusinessMapper.class);

    BusinessQueryOutDto toBusinessQueryOutDto(Business business);

    List<BusinessQueryOutDto> toBusinessQueryOutDtoList(List<Business> businessList);
}
