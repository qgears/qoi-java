package me.saharnooby.qoi;

import java.io.IOException;

/**
 * This exception is thrown when decoder detects invalid data in the input stream.
 */
public final class InvalidQOIStreamException extends IOException {

	private static final long serialVersionUID = 1L;

	InvalidQOIStreamException(String message) {
		super(message);
	}

}
