package fr.mdarfilal.batch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import fr.mdarfilal.batch.model.Personne;

public class FileItemProcessor implements ItemProcessor<Personne, Personne> {

	private static final Logger LOGGER = LoggerFactory.getLogger(FileItemProcessor.class);

	@Override
	public Personne process(Personne item) throws Exception {
		LOGGER.info("Je process");
		return item;
	}

}
