package com.itservicesdepot.example.springbatch.jsonreader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.itservicesdepot.example.springbatch.jsonreader.model.SoccerJsonEntry;

public class ExampleProcessor implements ItemProcessor<SoccerJsonEntry, SoccerJsonEntry> {
	private static Logger logger = LoggerFactory.getLogger(ExampleProcessor.class);
	
	public SoccerJsonEntry process(SoccerJsonEntry item) throws Exception {
		logger.info("Processing 'Number {}'", item);
		return item;
	}

}
