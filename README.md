# knetikcloud-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation & Usage

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

After the client library is installed/deployed, you can use it in your Maven project by adding the following to your *pom.xml*:

```xml
<dependency>
    <groupId>com.knetikcloud</groupId>
    <artifactId>knetikcloud-android-client</artifactId>
    <version>3.0.2</version>
    <scope>compile</scope>
</dependency>

```

## Author

support@knetik.com


