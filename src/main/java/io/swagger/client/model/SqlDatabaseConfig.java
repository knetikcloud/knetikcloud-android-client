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

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SqlDatabaseConfig {
  
  @SerializedName("connection_pool_size")
  private Integer connectionPoolSize = null;
  @SerializedName("connection_string")
  private String connectionString = null;
  @SerializedName("db_name")
  private String dbName = null;
  @SerializedName("hostname")
  private String hostname = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("port")
  private Integer port = null;
  @SerializedName("username")
  private String username = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getConnectionPoolSize() {
    return connectionPoolSize;
  }
  public void setConnectionPoolSize(Integer connectionPoolSize) {
    this.connectionPoolSize = connectionPoolSize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getConnectionString() {
    return connectionString;
  }
  public void setConnectionString(String connectionString) {
    this.connectionString = connectionString;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDbName() {
    return dbName;
  }
  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getHostname() {
    return hostname;
  }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPort() {
    return port;
  }
  public void setPort(Integer port) {
    this.port = port;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SqlDatabaseConfig sqlDatabaseConfig = (SqlDatabaseConfig) o;
    return (this.connectionPoolSize == null ? sqlDatabaseConfig.connectionPoolSize == null : this.connectionPoolSize.equals(sqlDatabaseConfig.connectionPoolSize)) &&
        (this.connectionString == null ? sqlDatabaseConfig.connectionString == null : this.connectionString.equals(sqlDatabaseConfig.connectionString)) &&
        (this.dbName == null ? sqlDatabaseConfig.dbName == null : this.dbName.equals(sqlDatabaseConfig.dbName)) &&
        (this.hostname == null ? sqlDatabaseConfig.hostname == null : this.hostname.equals(sqlDatabaseConfig.hostname)) &&
        (this.password == null ? sqlDatabaseConfig.password == null : this.password.equals(sqlDatabaseConfig.password)) &&
        (this.port == null ? sqlDatabaseConfig.port == null : this.port.equals(sqlDatabaseConfig.port)) &&
        (this.username == null ? sqlDatabaseConfig.username == null : this.username.equals(sqlDatabaseConfig.username));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.connectionPoolSize == null ? 0: this.connectionPoolSize.hashCode());
    result = 31 * result + (this.connectionString == null ? 0: this.connectionString.hashCode());
    result = 31 * result + (this.dbName == null ? 0: this.dbName.hashCode());
    result = 31 * result + (this.hostname == null ? 0: this.hostname.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.port == null ? 0: this.port.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlDatabaseConfig {\n");
    
    sb.append("  connectionPoolSize: ").append(connectionPoolSize).append("\n");
    sb.append("  connectionString: ").append(connectionString).append("\n");
    sb.append("  dbName: ").append(dbName).append("\n");
    sb.append("  hostname: ").append(hostname).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  port: ").append(port).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
