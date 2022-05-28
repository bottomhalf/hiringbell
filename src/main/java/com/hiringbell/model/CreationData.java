package com.hiringbell.model;

import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class CreationData {
    private Long CreatedBy;
    private Long UpdatedBy;
    private Date CreatedOn;
    private Date UpdatedOn;
}
