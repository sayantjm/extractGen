package com.db.extractGen.service;

import com.db.extractGen.model.ReportType;
import com.db.extractGen.model.tflmDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sayantjm on 19/9/20
 */
@Service
public interface ExtractGenService {
    List<String> extractGen(ReportType reportType);
}
