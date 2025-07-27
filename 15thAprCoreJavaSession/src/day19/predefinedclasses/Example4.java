package day19.predefinedclasses;

public class Example4 {

	public static void main(String[] args) {
		System.out.println("user current dir: "+System.getProperty("user.dir"));
		System.out.println("user home dir: "+System.getProperty("user.home"));
		System.out.println("Java version: "+System.getProperty("java.home"));
		System.clearProperty("user.dir");
		System.out.println("user current dir: "+System.getProperty("user.dir"));
		System.setProperty("user.dir", "C:\\Users\\Asus\\Desktop");
		System.out.println("updated, user current dir: "+System.getProperty("user.dir"));
		System.out.println("system time: "+System.currentTimeMillis());
	}

}
/*

Key					Meaning
"file.separator"	Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
"java.class.path"	Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a platform-specific character specified in the path.separator property.
"java.home"	Installation directory for Java Runtime Environment (JRE)
"java.vendor"	JRE vendor name
"java.vendor.url"	JRE vendor URL
"java.version"	JRE version number
"line.separator"	Sequence used by operating system to separate lines in text files
"os.arch"	Operating system architecture
"os.name"	Operating system name
"os.version"	Operating system version
"path.separator"	Path separator character used in java.class.path
"user.dir"	User working directory
"user.home"	User home directory
"user.name"	User account name


*/