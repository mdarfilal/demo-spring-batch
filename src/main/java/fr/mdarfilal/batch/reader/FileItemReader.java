package fr.mdarfilal.batch.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class FileItemReader implements ItemReader<String> {

	private static final Logger LOGGER = LoggerFactory.getLogger(FileItemReader.class);

	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		LOGGER.info("Je lis le fichier");
		return new String();
	}

}
