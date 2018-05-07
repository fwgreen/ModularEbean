# ModularEbean
Test of JPMS and Ebean


**Gotcha:**

For regular JDK 10 projects, due to changes in JDK 9, `javax.xml.bind` must be imported.
```Xml
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.3.0</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.bind</groupId>
    <artifactId>jaxb-core</artifactId>
    <version>2.3.0</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.bind</groupId>
    <artifactId>jaxb-impl</artifactId>
    <version>2.3.0</version>
</dependency>
```
In modular projects, adding `java.xml.bind` to `module-info.java` still works in JDK 10.
