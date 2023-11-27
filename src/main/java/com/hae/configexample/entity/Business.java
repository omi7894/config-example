package com.hae.configexample.entity;

import com.hae.configexample.util.CommonUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;

//@Table(name = "BUSINESS")
@Entity
@Data
@Builder
@AllArgsConstructor
public class Business {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "company_code")
    private String companyCode;

    @Column(name = "group_code")
    private String groupCode;

    @Column(name = "group_code_name")
    private String groupCodeName;

    @Column(name = "code")
    private String code;

    @Column(name = "code_name")
    private String codeName;

    @Column(name = "description")
    private String description;

    @Column(name = "use_yn")
    private Character useYn;

    private String createUserId;
    private ZonedDateTime createDatetime;
    private String modifyUserId;
    private ZonedDateTime modifyDatetime;

    public Business() {
        if (this.id == null) {
            this.id = CommonUtils.getUUID();
        }
    }
}
