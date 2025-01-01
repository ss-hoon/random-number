## 난수 생성기

### 🔔 Discription
* 원하는 타입에 맞는 정수나 소수를 랜덤하게 생성하여 반환합니다.

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
    // 1. 원하는 타입을 세팅한다.
    DataType dataType = DataType.INT; // LONG, FLOAT, DOUBLE

    // 2. 난수 생성 메서드를 호출한다.
    RandomService.getRandomNumber(dataType);
  ```
