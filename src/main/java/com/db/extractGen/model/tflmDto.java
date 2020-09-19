package com.db.extractGen.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sayantjm on 19/9/20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class tflmDto {
    String reportType;
    String collateralIdentifier;
    String contractIdentifier;
    String branch;

    public String toString() {
        return this.reportType.concat("|").concat(collateralIdentifier).concat("|").concat(contractIdentifier).concat("|").concat(branch);
    }
}
