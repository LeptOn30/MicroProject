package com.dgw.project.core.report.port.in;

import com.dgw.project.core.report.model.GetProjectSummaryCommand;
import com.dgw.project.core.report.model.ProjectSummary;
import com.dgw.project.core.report.model.ProjectSummaryReport;
import com.dgw.project.core.report.model.ReportGenerator;

public interface ReportUseCases {

    ProjectSummaryReport generateReport(GetProjectSummaryCommand command,
                                        ReportGenerator<ProjectSummary, ProjectSummaryReport> reportGenerator);
}
