package fr.ceanacre.gcm.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.eclipse.papyrus.junit.framework.classification.tests.AbstractPapyrusTest;

/**
 * this class is used to load JSON File
 */
public abstract class AbstractGCMGeneration extends AbstractPapyrusTest {
	protected String getResourceFileContent(final String fileName){
		return new BufferedReader(new InputStreamReader(this.getFileAsIOStream(fileName))).lines().collect(Collectors.joining("\n"));
	}

	protected InputStream getFileAsIOStream(final String fileName){
        InputStream ioStream = this.getClass()
            .getClassLoader()
            .getResourceAsStream(fileName);
        
        if (ioStream == null) {
            System.err.println( new IllegalArgumentException(fileName + " is not found"));
        }
        return ioStream;
    }

	
}
