package com.grant.research.api.idempotent.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@NoArgsConstructor
@Log4j
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Idempotent {

    private Integer id;

    private Integer overNum;
}
