package com.db.extractGen.factory;

import com.db.extractGen.model.ReportType;
import com.db.extractGen.service.TransformationDetails;
import com.db.extractGen.service.impl.TransformationDetailsAuto;
import com.db.extractGen.service.impl.TransformationDetailsCLO;
import com.db.extractGen.service.impl.TransformationDetailsManual;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by sayantjm on 19/9/20
 */
@Component
public class StrategyFactory {
    private Map<ReportType, TransformationDetails> strategies = new EnumMap<>(ReportType.class);

    public StrategyFactory() {
        initStrategies();
    }

    public TransformationDetails getStrategy(ReportType reportType) {
        if (reportType == null || !strategies.containsKey(reportType)) {
            throw new IllegalArgumentException("Invalid " + reportType);
        }
        return strategies.get(reportType);
    }

    private void initStrategies() {
        strategies.put(ReportType.AUTO, new TransformationDetailsAuto());
        strategies.put(ReportType.MANUAL, new TransformationDetailsManual());
        strategies.put(ReportType.CLO, new TransformationDetailsCLO());
    }
}
