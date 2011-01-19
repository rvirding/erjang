package erjang;

import java.io.File;

import junit.framework.TestCase;

/**
 * Abstract class for Erjang JUnit test cases
 * 
 * @author Pavlo Baron <pb@pbit.org>
 *
 */
public abstract class AbstractErjangTestCase extends TestCase {

	protected File file;
	
	public AbstractErjangTestCase(File file) {
		super(file.getName());
		this.file = file;
	}
	
	public AbstractErjangTestCase(String name) {
		super(name);
        file = new File(name);
	}
	
	public void setFile(File file) {
		this.file = file;
        this.setName(file.getName());
	}
}
