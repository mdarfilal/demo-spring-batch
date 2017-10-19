package fr.mdarfilal.batch.task;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private JobRegistry jobRegistry;

	private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTask.class);

	@Scheduled(fixedDelay = 5000)
	public void scheduledMethod() throws JobExecutionException {
		LOGGER.info("Je schedule");
		Map<String, JobParameter> jobParameters = new HashMap<>();
		jobParameters.put("time", new JobParameter(System.currentTimeMillis()));
		jobLauncher.run(jobRegistry.getJob("job"), new JobParameters(jobParameters));
	}

	public JobLauncher getJobLauncher() {
		return jobLauncher;
	}

	public void setJobLauncher(JobLauncher jobLauncher) {
		this.jobLauncher = jobLauncher;
	}

	public JobRegistry getJobRegistry() {
		return jobRegistry;
	}

	public void setJobRegistry(JobRegistry jobRegistry) {
		this.jobRegistry = jobRegistry;
	}
}
