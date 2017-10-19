package fr.mdarfilal.batch.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

public class FileItemWriter implements ItemWriter<String> {

	private static final Logger LOGGER = LoggerFactory.getLogger(FileItemWriter.class);

	@Override
	public void write(List<? extends String> items) throws Exception {
		LOGGER.info("J'écris");
	}

}
