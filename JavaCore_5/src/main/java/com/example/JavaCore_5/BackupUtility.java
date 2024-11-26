package com.example.JavaCore_5;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.*;

@SpringBootApplication
public class BackupUtility {

	public static void main(String[] args) {
		try {
			createBackup("./source", "./backup");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void createBackup(String sourceDir, String backupDir) throws IOException {
		Path sourcePath = Paths.get(sourceDir);
		Path backupPath = Paths.get(backupDir);

		if (!Files.exists(backupPath)) {
			Files.createDirectories(backupPath);
		}

		try (DirectoryStream<Path> stream = Files.newDirectoryStream(sourcePath)) {
			for (Path entry : stream) {
				if (Files.isRegularFile(entry)) {
					copyFile(entry, backupPath.resolve(entry.getFileName()));
				}
			}
		}
	}

	private static void copyFile(Path source, Path destination) throws IOException {
		Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
	}

}
