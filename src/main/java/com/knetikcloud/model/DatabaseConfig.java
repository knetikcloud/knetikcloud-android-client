/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.knetikcloud.model.MongoDatabaseConfig;
import com.knetikcloud.model.SqlDatabaseConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DatabaseConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-05T11:01:01.795-05:00")
public class DatabaseConfig {
  @SerializedName("mongo")
  private MongoDatabaseConfig mongo = null;

  @SerializedName("sql")
  private SqlDatabaseConfig sql = null;

  public DatabaseConfig mongo(MongoDatabaseConfig mongo) {
    this.mongo = mongo;
    return this;
  }

   /**
   * Get mongo
   * @return mongo
  **/
  @ApiModelProperty(value = "")
  public MongoDatabaseConfig getMongo() {
    return mongo;
  }

  public void setMongo(MongoDatabaseConfig mongo) {
    this.mongo = mongo;
  }

  public DatabaseConfig sql(SqlDatabaseConfig sql) {
    this.sql = sql;
    return this;
  }

   /**
   * Get sql
   * @return sql
  **/
  @ApiModelProperty(value = "")
  public SqlDatabaseConfig getSql() {
    return sql;
  }

  public void setSql(SqlDatabaseConfig sql) {
    this.sql = sql;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseConfig databaseConfig = (DatabaseConfig) o;
    return Objects.equals(this.mongo, databaseConfig.mongo) &&
        Objects.equals(this.sql, databaseConfig.sql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mongo, sql);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseConfig {\n");
    
    sb.append("    mongo: ").append(toIndentedString(mongo)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

