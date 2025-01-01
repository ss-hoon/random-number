## 난수 생성기

### 🔔 Discription
* Randomly generate and return an number that matches the desired type.

<br>

### ⚙️ Settings
* Gradle
  ```groovy
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
    
    dependencies {
        implementation 'com.github.ss-hoon:random-number:1.0.9'
    }
  ```
  
* Maven
  ```xml
    <repositories>
        <repository>
          <id>jitpack.io</id>
          <url>https://jitpack.io</url>
        </repository>
    </repositories>
  
    <dependency>
        <groupId>com.github.ss-hoon</groupId>
        <artifactId>random-number</artifactId>
        <version>1.0.9</version>
    </dependency>
  ```

<br>

### 🔑 Support Type
* Integer
* Long
* Float
* Double

<br>

### ✏️ Usage
  ```java
    // 1. Set the desired type
    DataType dataType = DataType.INT; // LONG, FLOAT, DOUBLE

    // 2. Invoke a random number generation method.
    RandomService.getRandomNumber(dataType);
  ```
