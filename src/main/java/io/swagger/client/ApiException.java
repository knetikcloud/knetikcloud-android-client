/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client;

public class ApiException extends Exception {
  int code = 0;
  String message = null;

  public ApiException() {}

  public ApiException(int code, String message) {
    this.code = code;
    this.message = message;
  }

  /**
   * Get the HTTP status code.
   *
   * @return HTTP status code
   */
  public int getCode() {
    return code;
  }

  /**
   * Set the HTTP status code.
   *
   * @param code HTTP status code.
   */
  public void setCode(int code) {
    this.code = code;
  }

  /**
   * Get the error message.
   *
   * @return Error message.
   */
  public String getMessage() {
    return message;
  }

  /**
   * Set the error messages.
   *
   * @param message Error message.
   */
  public void setMessage(String message) {
    this.message = message;
  }
}
