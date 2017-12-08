package com.zlikun.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 运行JobLauncher示例
 * @author zlikun <zlikun-dev@hotmail.com>
 * @date 2017-12-08 17:24
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:job.xml")
public class JobLauncherTest {

    @Autowired
    private JobLauncher launcher;
    @Autowired
    private Job job;

    @Test
    public void launch() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {

        JobExecution result = launcher.run(job, new JobParameters());
        System.out.println(result.toString());

    }

}
