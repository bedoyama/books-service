package com.telluriac.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Price {
    private String amount;

    private String endDate;

    private String startDate;
}
