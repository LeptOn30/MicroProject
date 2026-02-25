package com.dgw.project.service.adapter.in.rest;

import com.dgw.project.core.report.model.GetProjectSummaryCommand;
import com.dgw.project.core.report.model.ProjectSummaryReport;
import com.dgw.project.core.task.model.TaskStatus;
import com.dgw.project.service.adapter.in.rest.infrastructure.jwt.JWTTokenService;
import com.dgw.project.service.adapter.in.rest.infrastructure.service.ExportFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ReportController {

    private final ExportFileService exportFileService;
    private final JWTTokenService jwtTokenService;

    @GetMapping("/{projectId}/export")
    public ResponseEntity<ByteArrayResource> export(
            @PathVariable("projectId") String projectId,
            @RequestParam("taskStatus") TaskStatus taskStatus,
            @RequestParam("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime from,
            @RequestParam("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime to,
            @RequestHeader("Authorization") String authorizationHeader
    ) {
        String connectedUserEmail = jwtTokenService.extractUserEmail(authorizationHeader);
        ProjectSummaryReport projectSummaryReport = exportFileService.exportTasksToCsv(new GetProjectSummaryCommand(connectedUserEmail, projectId, taskStatus, from, to));

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + projectSummaryReport.fileName() + "\"")
                .contentType(MediaType.parseMediaType("text/csv"))
                .body(projectSummaryReport.resource());
    }
}
