package com.db.extractGen.service.impl;

import com.db.extractGen.factory.StrategyFactory;
import com.db.extractGen.model.ReportType;
import com.db.extractGen.service.ExtractGenService;
import com.db.extractGen.service.TransformationDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sayantjm on 19/9/20
 */
@Service
@RequiredArgsConstructor
public class ExtractGenServiceImpl implements ExtractGenService {

    private final StrategyFactory strategyFactory;

    @Override
    public List<String> extractGen(ReportType reportType) {
        TransformationDetails transformerDetails = strategyFactory.getStrategy(reportType);

        return transformerDetails.transform();
    }
}
