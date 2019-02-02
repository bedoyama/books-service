package com.telluriac.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Price {
    private String amount;

    //TODO (2/2/19) Convert to Date
    private String endDate;

    //TODO (2/2/19) Convert to Date
    private String startDate;
}
