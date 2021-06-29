package com.dlink.job;

import com.dlink.executor.ExecutorSetting;
import com.dlink.result.IResult;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * JobResult
 *
 * @author wenmo
 * @since 2021/6/29 23:56
 */
@Getter
@Setter
public class JobResult {
    private Integer id;
    private JobConfig jobConfig;
    private String jobManagerAddress;
    private Job.JobStatus status;
    private String statement;
    private String jobId;
    private String error;
    private IResult result;
    private ExecutorSetting executorSetting;
    private LocalDate startTime;
    private LocalDate endTime;

    public JobResult(Integer id, JobConfig jobConfig, String jobManagerAddress, Job.JobStatus status, String statement, String jobId, String error, IResult result, ExecutorSetting executorSetting, LocalDate startTime, LocalDate endTime) {
        this.id = id;
        this.jobConfig = jobConfig;
        this.jobManagerAddress = jobManagerAddress;
        this.status = status;
        this.statement = statement;
        this.jobId = jobId;
        this.error = error;
        this.result = result;
        this.executorSetting = executorSetting;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
