package com.itservicesdepot.example.springbatch.jsonreader;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import com.itservicesdepot.example.springbatch.jsonreader.model.SoccerJsonEntry;

public class ExampleWriter implements ItemWriter<SoccerJsonEntry>{
	private static Logger logger = LoggerFactory.getLogger(ExampleWriter.class);
	
	public void write(List<? extends SoccerJsonEntry> items) throws Exception {
		for (SoccerJsonEntry item : items) {
			logger.info("Writing " + item);
		}
	}

}
