package com.db.extractGen;

import com.db.extractGen.factory.StrategyFactory;
import com.db.extractGen.model.ReportType;
import com.db.extractGen.service.impl.ExtractGenServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by sayantjm on 19/9/20
 */
@SpringBootTest
public class ExtractGenServiceTests {

    @Autowired
    private StrategyFactory strategyFactory;

    @Autowired
    private ExtractGenServiceImpl service;

    private Map<ReportType, List<String>> expectedLines = new EnumMap<>(ReportType.class);

    @Test
    public void transformAUTOTest() {
        initExpected();

        List<String> autoLines = service.extractGen(ReportType.AUTO);
        assertEquals(expectedLines.get(ReportType.AUTO), autoLines);

        List<String> manualLines = service.extractGen(ReportType.MANUAL);
        assertEquals(expectedLines.get(ReportType.MANUAL), manualLines);

        List<String> cloLines = service.extractGen(ReportType.CLO);
        assertEquals(expectedLines.get(ReportType.CLO), cloLines);

    }

    public void initExpected() {
        String auto1 = "AUTO|BG1234456_123|LD12345667|840";
        String auto2 = "AUTO|BG1234456_456|LD12345667|840";
        String auto3 = "AUTO|BG1234456_789|LD12345667|840";
        String manual1 = "MANUAL|BG1234456_123|LD12345667|840";
        String manual2 = "MANUAL|BG1234456_456|LD12345667|840";
        String manual3 = "MANUAL|BG1234456_789|LD12345667|840";
        String clo1 = "CLO|BG1234456_123|LD12345667|840";
        String clo2 = "CLO|BG1234456_456|LD12345667|840";
        String clo3 = "CLO|BG1234456_789|LD12345667|840";

        List<String> autoList = Arrays.asList(auto1, auto2, auto3);
        this.expectedLines.put(ReportType.AUTO, autoList);

        List<String> manualList = Arrays.asList(manual1, manual2, manual3);
        expectedLines.put(ReportType.MANUAL, manualList);

        List<String> cloList = Arrays.asList(clo1, clo2, clo3);
        expectedLines.put(ReportType.CLO, cloList);
    }

}
