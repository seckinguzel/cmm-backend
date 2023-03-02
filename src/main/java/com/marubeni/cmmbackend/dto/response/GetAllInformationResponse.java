package com.marubeni.cmmbackend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllInformationResponse {
    private double actual;
    private double nominal;
    private double uppertol;
    private double lowertol;
    private double deviation;
    private String groupName;
}
