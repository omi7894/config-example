package com.hae.configexample.controller.v1;

import com.hae.configexample.dto.query.in.BusinessQueryInDto;
import com.hae.configexample.dto.query.out.BusinessQueryOutDto;
import com.hae.configexample.service.query.BusinessQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/business")
@RequiredArgsConstructor
public class BusinessController {

    private final BusinessQueryService businessQueryService;

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<BusinessQueryOutDto> findBusinessById(@PathVariable String id){
        return ResponseEntity.ok()
                .body(businessQueryService.findBusinessById(id));
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<BusinessQueryOutDto>> findAll(@Valid @RequestBody BusinessQueryInDto businessQueryInDto){

        System.out.println(businessQueryInDto);

        return ResponseEntity.ok()
                .body(businessQueryService.findAll(businessQueryInDto));

    }
}
