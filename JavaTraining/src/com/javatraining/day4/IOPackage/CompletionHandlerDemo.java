package com.javatraining.day4.IOPackage;

import java.nio.ByteBuffer;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.channels.CompletionHandler;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.charset.Charset;
import java.nio.file.StandardOpenOption;

public class CompletionHandlerDemo {

	public static void main(String[] args) {
		Path path = Paths.get("testin.txt");// java1.7
		try {
			// Get an async channel
			AsynchronousFileChannel afc = AsynchronousFileChannel.open(path, StandardOpenOption.READ);

			// Get a completion handler
			ReadHandler handler = new ReadHandler();

			// Get the data size in bytes to read
			int fileSize = (int) afc.size();
			ByteBuffer dataBuffer = ByteBuffer.allocate(fileSize);

			// Prepare the attachment
			Attachment attach = new Attachment();
			attach.asyncChannel = afc;
			attach.buffer = dataBuffer;
			attach.path = path;

			// Perform the asynchronous read operation
			afc.read(dataBuffer, 0, attach, handler);

			try {
				// Let the thread sleep for five seconds,
				// to allow the asynchronous read to complete
				System.out.println("Sleeping for 5 seconds...");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Done...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

// Used as an attachment to the CompletionHandler
class Attachment {
	public Path path;
	public ByteBuffer buffer;
	public AsynchronousFileChannel asyncChannel;
}

// class to handle completion of the asynchronous read operation
class ReadHandler implements CompletionHandler<Integer, Attachment> {
	@Override
	public void completed(Integer result, Attachment attach) {
		System.out.format("%s bytes read from %s%n", result, attach.path);
		System.out.format("Read data is:%n");

		byte[] byteData = attach.buffer.array();// storing text.txt info or creating memory for text file content

		Charset cs = Charset.forName("UTF-8");
		String data = new String(byteData, cs);
		System.out.println(data);
		// create output and redirect into file that is pdf or exel or else

		try {
			// Close the channel
			attach.asyncChannel.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void failed(Throwable e, Attachment attach) {
		System.out.format("Read operation on %s file failed." + " The error is: %s%n", attach.path, e.getMessage());
		try {
			// Close the channel
			attach.asyncChannel.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}