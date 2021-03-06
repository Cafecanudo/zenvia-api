package br.com.ilink.zenviaapi.exceptions;

import java.io.IOException;

public class UnauthorizedException extends RuntimeException {

  public UnauthorizedException(IOException e) {
    super(e);
  }

  public UnauthorizedException() {
    super();
  }

  public UnauthorizedException(String message) {
    super(message);
  }
}
