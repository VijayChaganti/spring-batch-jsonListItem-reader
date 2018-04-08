package com.itservicesdepot.example.springbatch.jsonreader;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StopWatch;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:example-jobs.xml"})
public class JsonReaderTest {

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	@Qualifier(value = "exampleJsonReaderJob")
	private Job exampleJsonReaderJob;
	
	@Test
	public void exampleJob() throws Exception {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		JobExecution jobExecution = jobLauncher.run(this.exampleJsonReaderJob,
				new JobParametersBuilder()
						.addString("file", "C:\\work\\spring-batch\\file\\soccers.json")
						.addDate("now", new Date()).toJobParameters());

		stopWatch.stop();

		Assert.assertEquals(ExitStatus.COMPLETED, jobExecution.getExitStatus());
	}
}
