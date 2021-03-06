package com.db.extractGen.service.impl;

import com.db.extractGen.model.tflmDto;
import com.db.extractGen.service.TransformationDetails;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by sayantjm on 19/9/20
 */
@Service
public class TransformationDetailsCLO implements TransformationDetails {
    @Override
    public List<String> transform() {
        tflmDto line1 = tflmDto.builder().reportType("CLO").collateralIdentifier("BG1234456_123").contractIdentifier("LD12345667").branch("840").build();
        tflmDto line2 = tflmDto.builder().reportType("CLO").collateralIdentifier("BG1234456_456").contractIdentifier("LD12345667").branch("840").build();
        tflmDto line3 = tflmDto.builder().reportType("CLO").collateralIdentifier("BG1234456_789").contractIdentifier("LD12345667").branch("840").build();

        List<tflmDto> rowList = Arrays.asList(line1, line2, line3);

        return rowList.stream().map(line -> line.toString()).collect(Collectors.toList());
    }
}
