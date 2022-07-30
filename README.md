
# Simple Fan

## Requirements:
* Java 8
* JUnit 4 (Jar file)
* Hamcrest (Jar file)

---

## Fan.java

A simple fan that has two pull cords. One pull cord increases the speed by one level. The fan resets speed on the fourth pull.
The other pull cord reverses the fan's direction. We assume the fan has continuous power and starts at speed=0 in clockwise direction.

### Terminal Usage:

1. Download JUnit4 (junit-4.13.2.jar) and Hamcrest (hamcrest-2.2.jar).
2. Clone this repo locally and put the two downloaded jar files in the 'Fan' directory.
3. 'cd' into the 'Fan' directory.

To only interact with the Fan:

```
javac src/Main.java src/Fan.java
```
```
java -cp . src/Main
```

---

To compile and run the JUnit 4 tests:

#### On Windows:

```
javac -cp junit-4.13.2.jar;hamcrest-2.2.jar;. test/FanTest.java src/Fan.java
```
```
java -cp junit-4.13.2.jar;hamcrest-2.2.jar;. org.junit.runner.JUnitCore test.FanTest
```

#### On Linux:
```
javac -cp .:junit-4.13.2.jar:hamcrest-2.2.jar test/FanTest.java src/Fan.java
```
```
java -cp .:junit-4.13.2.jar:hamcrest-2.2.jar org.junit.runner.JUnitCore test.FanTest
```