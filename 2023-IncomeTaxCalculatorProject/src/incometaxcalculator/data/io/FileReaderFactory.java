package incometaxcalculator.data.io;

import incometaxcalculator.data.management.TaxpayerManager;
import incometaxcalculator.exceptions.WrongFileEndingException;

public class FileReaderFactory {
    
    public FileReader createFileReader(String fileFormat) throws WrongFileEndingException {
	if (fileFormat.equals("txt")) {
	    return new TXTFileReader();
	} else if (fileFormat.equals("xml")) {
	    return new XMLFileReader();
	} else {
	    throw new WrongFileEndingException();
	}
    }
}
