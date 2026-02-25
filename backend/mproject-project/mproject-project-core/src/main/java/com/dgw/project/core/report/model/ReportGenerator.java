package com.dgw.project.core.report.model;

@FunctionalInterface
public interface ReportGenerator<T, R> {
    R generate(T input);
}
