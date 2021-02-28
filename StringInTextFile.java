boolean findStringInFile(String filePath, String str) throws FileNotFoundException {
	File file = new File(filePath);

	Scanner scanner = new Scanner(file);

	// read the file line by line
	while (scanner.hasNextLine()) {
		String line = scanner.nextLine();
		if (line.contains(str)) {
			scanner.close();
			return true;
		}
	}
	scanner.close();
	return false;
}
//No inline characters.
